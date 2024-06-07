package beam.jim.contact_list.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000") // Permitindo requisições do frontend em localhost:3000
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitindo esses métodos HTTP
                .allowedHeaders("*") // Permitindo todos os cabeçalhos
                .allowCredentials(true) // Permitindo credenciais
                .maxAge(3600); // Tempo máximo de cache da opção preflight
    }
}
