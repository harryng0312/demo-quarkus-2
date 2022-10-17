package org.harryng.demo.config;

import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Getter
public class SystemConfig {

    @ConfigProperty(name = "base.baseUrl")
    String addressPort;
}
