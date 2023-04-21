package com.xxl.job.admin.service;

import com.xxl.job.core.biz.model.XxlJobGroup;

/**
 * 执行器
 * @Author: free
 * @Date: 2023/4/21 14:30
 */
public interface XxlJobGroupService {

    XxlJobGroup selectGroup(String appName);
}
