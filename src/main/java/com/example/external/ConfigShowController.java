package com.example.external;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("config")
@ConfigurationProperties(prefix = "medium")
@Getter
@Setter
public class ConfigShowController {

    private String username;

    @Autowired
    private CommonProperties commonProperties;

    @GetMapping
    public ResponseEntity showConfig()
    {

        final StringBuilder output = new StringBuilder();
        output.append("from app : ").append(username)
                .append("  ===== ")
                .append(" from common properties : ")
                .append(commonProperties.getComment());

        return ResponseEntity.ok(output.toString());
    }

}
