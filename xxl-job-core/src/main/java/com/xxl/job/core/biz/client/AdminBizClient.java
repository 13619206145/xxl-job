package com.xxl.job.core.biz.client;

import com.xxl.job.core.biz.AdminBiz;
import com.xxl.job.core.biz.model.*;
import com.xxl.job.core.util.XxlJobRemotingUtil;

import java.util.List;

/**
 * admin api test
 *
 * @author xuxueli 2017-07-28 22:14:52
 */
public class AdminBizClient implements AdminBiz {

    public AdminBizClient() {
    }
    public AdminBizClient(String addressUrl, String accessToken) {
        this.addressUrl = addressUrl;
        this.accessToken = accessToken;

        // valid
        if (!this.addressUrl.endsWith("/")) {
            this.addressUrl = this.addressUrl + "/";
        }
    }

    private String addressUrl ;
    private String accessToken;
    private int timeout = 30;


    @Override
    public ReturnT<String> callback(List<HandleCallbackParam> callbackParamList) {
        return XxlJobRemotingUtil.postBody(addressUrl+"api/callback", accessToken, timeout, callbackParamList, String.class);
    }

    /**
    * registry
    * @author free
    * @date 2023/4/20 20:34
    * @param registryParam 执行器参数
    * @return {@link ReturnT< String>}
    */
    @Override
    public ReturnT<String> registry(RegistryParam registryParam) {
        return XxlJobRemotingUtil.postBody(addressUrl + "api/registry", accessToken, timeout, registryParam, String.class);
    }

    /**
    * 创建执行器
    * @author free
    * @date 2023/4/20 23:03
    * @param xxlJobGroup 执行器
    * @return {@link ReturnT< String>}
    */
    @Override
    public ReturnT<String> registryGroup (XxlJobGroup xxlJobGroup) {
        return XxlJobRemotingUtil.postBody(addressUrl + "api/registryGroup", accessToken, timeout, xxlJobGroup, String.class);
    }

    /**
    * 任务注册
    * @author free
    * @date 2023/4/20 20:36
    * @param jobParam
    * @return {@link ReturnT< String>}
    */
    @Override
    public ReturnT<String> registryJob(XxlJobInfo jobParam) {
        return XxlJobRemotingUtil.postBody(addressUrl + "api/registryJob", accessToken, timeout, jobParam, String.class);
    }

    @Override
    public ReturnT<String> registryRemove(RegistryParam registryParam) {
        return XxlJobRemotingUtil.postBody(addressUrl + "api/registryRemove", accessToken, timeout, registryParam, String.class);
    }

}
