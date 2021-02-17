package com.avanes.alfabank.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configurable
@ConfigurationProperties(prefix = "latest")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlfaBankConfig {
    private String app_id;
    private String base;

}