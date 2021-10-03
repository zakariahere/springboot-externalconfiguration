package com.example.external;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "medium.common")
@Data
public class CommonProperties {
    private String comment;
}
