package com.wdlily.future;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/26 14:21
 */
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource({"classpath:dubbo-consumer.xml"})
public class DubboConfig {

}
