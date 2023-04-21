package com.xxl.job.core.handler.annotation;

import com.xxl.job.core.enums.ExecutorBlockStrategyEnum;
import com.xxl.job.core.enums.JobStatusEnum;
import com.xxl.job.core.enums.RouterPolicyModeEnum;

import java.lang.annotation.*;

/**
 * 新增注解实现自动化创建定时任务, 具有任务状态, 是否使用等
 * @Author: free
 * @Date: 2023/4/20 15:22
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface NewXxlJob {
    /**
     * 任务名
     */
    String value();

    /**
     * init 处理程序，在 JobThread 初始化时调用
     */
    String init() default "";

    /**
     * 销毁处理程序，在作业线程销毁时调用
     */
    String destroy() default "";

    //任务描述
    String desc() ;

    // 执行频率表达式cron
    String cron() ;

    //新建任务初始状态
    JobStatusEnum status() default JobStatusEnum.RUN;

    //阻塞策略
    ExecutorBlockStrategyEnum blockingHandling() default ExecutorBlockStrategyEnum.SERIAL_EXECUTION;

    //告警邮箱
    String email() default "" ;

    //路由策略
    RouterPolicyModeEnum routeHandler() default RouterPolicyModeEnum.RANDOM;

}
