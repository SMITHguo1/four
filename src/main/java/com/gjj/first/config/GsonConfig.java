package com.gjj.first.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

/**
 * Gson解析器
 */
//@Configuration
public class GsonConfig {
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter(){
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//
//        GsonBuilder builder = new GsonBuilder();
//        builder.setDateFormat("yyyy-MM-dd");
//        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
//
//        Gson gson = builder.create();
//        converter.setGson(gson);
//
//        return  converter;
//    }
}
