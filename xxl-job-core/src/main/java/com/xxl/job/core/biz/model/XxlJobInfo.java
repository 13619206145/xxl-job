package com.xxl.job.core.biz.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * job regsit param body
 * @Author: free
 * @Date: 2023/4/20 20:43
 */
@Data
@Accessors(chain = true) // 链式
public class XxlJobInfo {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 执行器主键ID
     */
    private int jobGroup;
    /**
     * 任务描述
     */
    private String jobDesc;
    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 负责人
     */
    private String author;
    /**
     * 报警邮件
     */
    private String alarmEmail;
    /**
     * 调度类型
     */
    private String scheduleType;
    /**
     * 调度配置，值含义取决于调度类型
     */
    private String scheduleConf;
    /**
     * 调度过期策略
     */
    private String misfireStrategy;
    /**
     * 执行器路由策略
     */
    private String executorRouteStrategy;
    /**
     * 执行器，任务Handler名称
     */
    private String executorHandler;
    /**
     * 执行器，任务参数
     */
    private String executorParam;
    /**
     * 阻塞处理策略
     */
    private String executorBlockStrategy;
    /**
     * 任务执行超时时间，单位秒
     */
    private int executorTimeout;
    /**
     * 失败重试次数
     */
    private int executorFailRetryCount;
    /**
     * GLUE类型	#com.xxl.job.core.glue.GlueTypeEnum
     */
    private String glueType;
    /**
     * GLUE源代码
     */
    private String glueSource;
    /**
     * GLUE备注
     */
    private String glueRemark;
    /**
     * GLUE更新时间
     */
    private Date glueUpdatetime;
    /**
     * 子任务ID，多个逗号分隔
     */
    private String childJobId;
    /**
     * 调度状态：0-停止，1-运行
     */
    private int triggerStatus;
    /**
     * 上次调度时间
     */
    private long triggerLastTime;
    /**
     * 下次调度时间
     */
    private long triggerNextTime;

}
