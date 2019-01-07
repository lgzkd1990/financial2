package com.zl.financial.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerInfo {

    private String groupName ="controller";

    private String basePackage;

    private String antPath;

    private String title = "HTTP API";

    private String description = "Swagger 自动生成接口文档";

    private String license = "Apache License Version 2.0";
}
