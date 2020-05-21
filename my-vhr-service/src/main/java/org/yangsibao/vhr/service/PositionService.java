package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.PositionMapper;
import org.yangsibao.vhr.model.Position;

import java.util.Date;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:55
 */
@Service
public class PositionService {

    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }

    public Integer updatePositions(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePositionById(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    public Integer deletePositionsByIds(Integer[] ids) {
        return positionMapper.deletePositionsByIds(ids);
    }
}
