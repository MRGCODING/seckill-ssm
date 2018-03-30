package com.ghq.mapper;

import com.ghq.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-dao.xml"})
public class SeckillMapperTest {
    @Autowired
    private SeckillMapper seckillMapper;

    @Test
    public void reduceNumber() throws Exception {
        long seckillId = 1000;
        Date localDateTime = new Date();
        int i = seckillMapper.reduceNumber(seckillId, localDateTime);
        System.out.println("--------------------------");
        System.out.println(i);
        System.out.println("--------------------------");
    }
    @Test
    public void queryById() throws Exception {
        long seckillId = 1000;
        Seckill seckill = seckillMapper.queryById(seckillId);
        System.out.println(seckill.toString());
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = seckillMapper.queryAll(0,100);
        for (Seckill seckill : seckills) {
            System.out.println(seckill.toString());
        }
    }
}
