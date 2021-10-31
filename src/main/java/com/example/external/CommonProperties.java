package com.example.external;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Component
@ConfigurationProperties(prefix = "medium.common")
@Data
@Validated
public class CommonProperties {

    @NotBlank
    private String comment;
}
