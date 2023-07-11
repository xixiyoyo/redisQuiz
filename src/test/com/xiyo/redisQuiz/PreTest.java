package com.xiyo.redisQuiz;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
@Slf4j
public class PreTest {

    @Test
    public void RunTest(){
            String url = "http://172.31.28.28/cdc/login";
            int start = url.indexOf("/", 0) + 2;
            log.info(String.valueOf(start));
            Pattern pattern = Pattern.compile(":");
            Matcher findMatcher = pattern.matcher(url);
            int number = 0;
            while (findMatcher.find()) {
                number++;
                if (number == 2) {
                    break;
                }
            }
            int end = findMatcher.start();
            String ip = url.substring(start, end);

        System.out.println(ip);
    }
}
