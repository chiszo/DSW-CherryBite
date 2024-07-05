package pe.edu.cibertec.cherryBite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CherryBiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CherryBiteApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configGlobalCors(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("apiweb/cherry/**")
						.allowedMethods("GET","POST","PUT")
						.allowedOrigins("*");
			}
		};
	}
}
