package com.ghq.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class SeckillMapperTest {
    @Autowired
    private com.ghq.mapper.SeckillMapper seckillMapper;

    @Test
    public void reduceNumber() throws Exception {
        long seckillId = 1000;
        LocalDateTime localDateTime = LocalDateTime.now();
        int i = seckillMapper.reduceNumber(seckillId, localDateTime);
        System.out.println("--------------------------");
        System.out.println(i);
        System.out.println("--------------------------");
    }
}
