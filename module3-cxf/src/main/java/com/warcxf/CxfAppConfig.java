package com.warcxf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import( {com.hello.impl.ServiceImplAppConfig.class, com.hello.rest.HelloSvRestConfig.class})
public class CxfAppConfig {
}
