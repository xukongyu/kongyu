package com.huarui.zls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication(exclude = RedisAutoConfiguration.class)
@MapperScan("com.huarui.zls.mapper")
public class ZlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZlsApplication.class, args);
    }
    @Bean
    public Converter<String, Date> addNewDate() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String source) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date parse1 = null;
                try {
                    System.out.println("Jinlai了");
                    parse1 = sdf.parse(source);

                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return parse1;
            }
        };
    }
}
