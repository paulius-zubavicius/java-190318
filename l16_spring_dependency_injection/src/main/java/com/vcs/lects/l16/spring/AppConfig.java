package com.vcs.lects.l16.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({ "com.vcs.lects.l16.spring.*" })
@PropertySource({"classpath:config.properties"})
public class AppConfig {

	// TODO

	@Bean(name = "version")
	public String getVersion() {

		return "v0.9 BETA";
	}

	@Bean(name = "continent")
	public boolean getCarContinent() {
		return true;
	}

}
