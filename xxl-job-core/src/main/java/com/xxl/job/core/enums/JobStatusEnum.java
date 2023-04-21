package com.xxl.job.core.enums;

/**
 * @Author: free
 * @Date: 2023/4/20 15:54
 */
public enum JobStatusEnum {
    RUN("RUN","运行"),
    STOP("STOP","停止");

    private String code ;
    private String desc ;

    JobStatusEnum (String code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode () {
        return code;
    }
}
