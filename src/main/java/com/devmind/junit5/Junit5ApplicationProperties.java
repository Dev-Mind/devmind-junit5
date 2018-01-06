package com.devmind.junit5;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Dev-Mind <guillaume@dev-mind.fr>
 */
@ConfigurationProperties("devmind")
public class Junit5ApplicationProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
