package org.yangsibao.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangsibao.vhr.mapper.JobLevelMapper;
import org.yangsibao.vhr.model.JobLevel;

import java.util.Date;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/21-18:53
 */
@Service
public class JobLevelService {

    @Autowired
    JobLevelMapper jobLevelMapper;

    public List<JobLevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }

    public Integer addJobLevel(JobLevel jobLevel) {
        jobLevel.setCreateDate(new Date());
        jobLevel.setEnabled(true);
        return jobLevelMapper.insertSelective(jobLevel);
    }

    public Integer updateJobLevelById(JobLevel jobLevel) {
        return jobLevelMapper.updateByPrimaryKeySelective(jobLevel);
    }

    public Integer deleteJobLevelById(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteJobLevelsByIds(Integer[] ids) {
        return jobLevelMapper.deleteJobLevelsByIds(ids);
    }
}
