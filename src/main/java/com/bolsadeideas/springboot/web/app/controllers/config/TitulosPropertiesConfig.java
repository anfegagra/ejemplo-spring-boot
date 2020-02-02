package com.bolsadeideas.springboot.web.app.controllers.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:titulos.properties")
})
public class TitulosPropertiesConfig {

}
