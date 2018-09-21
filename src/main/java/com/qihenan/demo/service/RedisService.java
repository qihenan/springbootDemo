//package com.qihenan.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.io.Serializable;
//
//public class RedisService {
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    public boolean set(final String key, Object value) {
//        boolean result = false;
//        try {
//            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
//            operations.set(key, value);
//            result = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//}
