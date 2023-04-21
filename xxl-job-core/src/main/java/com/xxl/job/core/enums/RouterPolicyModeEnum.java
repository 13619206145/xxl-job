package com.xxl.job.core.enums;

/**
 * 路由策略模式
 * @Author: free
 * @Date: 2023/4/20 15:47
 */
public enum RouterPolicyModeEnum {

    FIRST("jobconf_route_first", "第一个"),
    LAST("jobconf_route_last", "最后一个"),
    ROUND("jobconf_route_round", "轮询"),
    RANDOM("jobconf_route_random","随机" ),
    CONSISTENT_HASH("jobconf_route_consistenthash","一致性HASH" ),
    LEAST_FREQUENTLY_USED("jobconf_route_lfu","最不经常使用"),
    LEAST_RECENTLY_USED("jobconf_route_lru", "最近最久未使用"),
    FAILOVER("jobconf_route_failover","故障转移"),
    BUSYOVER("jobconf_route_busyover", "忙碌转移"),
    SHARDING_BROADCAST("jobconf_route_shard", "分片广播");

    private String code ;
    private String desc ;

    RouterPolicyModeEnum (String code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode () {
        return code;
    }
}
