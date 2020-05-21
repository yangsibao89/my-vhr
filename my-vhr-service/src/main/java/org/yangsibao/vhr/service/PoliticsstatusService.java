package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.PoliticsstatusMapper;
import org.yangsibao.vhr.model.Politicsstatus;

import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:55
 */
@Service
public class PoliticsstatusService {

    @Autowired
    PoliticsstatusMapper politicsstatusMapper;

    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
