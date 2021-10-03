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

    @GetMapping
    public ResponseEntity showConfig()
    {
        return ResponseEntity.ok(username);
    }

}
