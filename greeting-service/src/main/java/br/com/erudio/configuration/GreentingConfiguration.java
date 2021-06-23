package br.com.erudio.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("greenting-service")
public class GreentingConfiguration {

    private String greenting;
    private String defaultValue;

    public GreentingConfiguration() {
    }

    public String getGreenting() {
        return greenting;
    }

    public void setGreenting(String greenting) {
        this.greenting = greenting;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
