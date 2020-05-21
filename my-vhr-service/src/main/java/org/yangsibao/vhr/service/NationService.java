package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.NationMapper;
import org.yangsibao.vhr.model.Nation;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:54
 */
@Service
public class NationService {

    @Autowired
    NationMapper nationMapper;

    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }

}
