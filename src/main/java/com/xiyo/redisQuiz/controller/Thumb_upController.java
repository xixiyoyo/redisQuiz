package com.xiyo.redisQuiz.controller;

import com.xiyo.redisQuiz.result.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/api/thumb")
public class Thumb_upController {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @RequestMapping("clickOn")
//    @ApiOperation("点赞触发")
    public ResponseResult<String> ClickOn(){

//        ValueOperations<String, Object> ops = redisTemplate.opsForValue().

        return ResponseResult.success();
    }
}
