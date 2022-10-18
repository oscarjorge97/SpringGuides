package com.oyataco.consumingRESTwebServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingResTwebServicesApplication {
	private static final Logger registrador= LoggerFactory.getLogger(ConsumingResTwebServicesApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(ConsumingResTwebServicesApplication.class, args);

	}

	@Bean
	public RestTemplate plantillaREST(RestTemplateBuilder constructorRest){
		return constructorRest.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate plantillaREST) throws Exception{
		return args ->{
			Cotizacion cotizacion=plantillaREST.getForObject("https://github.com/oscarjorge97",Cotizacion.class);
			registrador.info(cotizacion.toString());
		};
	}
}
