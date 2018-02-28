package com.wdlily.future.redis;

import com.wdlily.future.ServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/28 14:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
public class RedisTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    String key = "aaa";
    String value = "bbb";
    Integer TIME_OUT = 30000;

    @Test
    public void put() {

        redisTemplate.opsForValue().set("hadoop", "spark", 10000, TimeUnit.SECONDS);


        System.out.println(redisTemplate.opsForValue().get("hadoop"));

    }


}
