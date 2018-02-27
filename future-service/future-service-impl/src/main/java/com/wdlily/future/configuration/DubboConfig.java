package com.wdlily.future.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 14:08
 */
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource({"classpath:*.xml"})
public class DubboConfig {

}
