package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yangsibao.vhr.mapper.HrMapper;
import org.yangsibao.vhr.mapper.HrRoleMapper;
import org.yangsibao.vhr.model.Hr;
import org.yangsibao.vhr.utils.HrUtils;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/13-17:54
 */
@Service
public class HrService implements UserDetailsService {


    @Autowired
    HrMapper hrMapper;

    @Autowired
    HrRoleMapper hrRoleMapper;

    /**
     * 当前hr查找其他所有hr
     *
     * @param keyword
     * @return
     */
    public List<Hr> getAllHrs(String keyword) {
        return hrMapper.getAllHrs(HrUtils.getCurrentHr().getId(), keyword);
    }

    //增

    //删

    public Integer deleteHrById(Integer id) {
        return hrMapper.deleteByPrimaryKey(id);
    }

    //改
    public Integer updateHr(Hr hr) {
        return hrMapper.updateByPrimaryKeySelective(hr);
    }

    public void updatePasswd(Integer id, String password) {
        hrMapper.updatePasswd(id, password);
    }


    public boolean updateHrPasswd(String oldpass, String pass, Integer hrid) {
        Hr hr = hrMapper.selectByPrimaryKey(hrid);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(oldpass, hr.getPassword())) {
            String encodePass = encoder.encode(pass);
            Integer result = hrMapper.updatePasswd(hrid, encodePass);
            if (result == 1) {
                return true;
            }
        }
        return false;
    }

    @Transactional
    public boolean updateHrRole(Integer hrid, Integer[] rids) {
        hrRoleMapper.deleteByHrid(hrid);
        return hrRoleMapper.addRole(hrid, rids) == rids.length;
    }

    //查
    public List<Hr> getAllHrsExceptCurrentHr() {
        return hrMapper.getAllHrsExceptCurrentHr(HrUtils.getCurrentHr().getId());
    }

    //  实现 UserDetailsService 连接数据库
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        hr.setRoles(hrMapper.getHrRolesById(hr.getId()));
        return hr;
    }
}
