package com.xxl.job.admin;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@Slf4j
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext run = SpringApplication.run(XxlJobAdminApplication.class,args);
		ConfigurableEnvironment environment = run.getEnvironment();
		String port = environment.getProperty("server.port");
		String path = environment.getProperty("server.servlet.context-path");
		String ip = InetAddress.getLocalHost().getHostAddress();
		log.info("| 后台管理地址:{}","http://"+ip+":"+port+path+"	|");
	}

}