package com.xxl.job.admin.service.impl;

import com.xxl.job.admin.dao.XxlJobGroupDao;
import com.xxl.job.admin.service.XxlJobGroupService;
import com.xxl.job.core.biz.model.XxlJobGroup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: free
 * @Date: 2023/4/21 14:31
 */
@Service
public class XxlJobGroupServiceImpl implements XxlJobGroupService {

    @Resource
    private XxlJobGroupDao xxlJobGroupDao ;
    @Override
    public XxlJobGroup selectGroup (String appName) {
        return xxlJobGroupDao.selectGroup(appName);
    }
}
