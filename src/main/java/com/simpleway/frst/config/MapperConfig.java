package com.simpleway.frst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
public class MapperConfig {

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer configure = new MapperScannerConfigurer();
    configure.setBasePackage("com.simpleway.frst.mapper");
    configure.setMarkerInterface(Mapper.class);
    return configure;
  }
  
}
