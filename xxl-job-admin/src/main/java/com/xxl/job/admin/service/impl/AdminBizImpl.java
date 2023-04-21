package com.xxl.job.admin.service.impl;

import com.xxl.job.admin.core.thread.JobCompleteHelper;
import com.xxl.job.admin.core.thread.JobRegistryHelper;
import com.xxl.job.admin.core.util.JacksonUtil;
import com.xxl.job.core.biz.AdminBiz;
import com.xxl.job.core.biz.model.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xuxueli 2017-07-27 21:54:20
 */
@Service
public class AdminBizImpl implements AdminBiz {


    @Override
    public ReturnT<String> callback(List<HandleCallbackParam> callbackParamList) {
        return JobCompleteHelper.getInstance().callback(callbackParamList);
    }

    @Override
    public ReturnT<String> registry(RegistryParam registryParam) {
        return JobRegistryHelper.getInstance().registry(registryParam);
    }

    @Override
    public ReturnT<String> registryJob (XxlJobInfo registerJobParam) {
        return JobRegistryHelper.getInstance().registryJob(registerJobParam);
    }

    @Override
    public ReturnT<String> registryGroup (XxlJobGroup xxlJobGroup) {
        return JobRegistryHelper.getInstance().registryGroup(xxlJobGroup);
    }

    @Override
    public ReturnT<String> registryRemove(RegistryParam registryParam) {
        return JobRegistryHelper.getInstance().registryRemove(registryParam);
    }

}
