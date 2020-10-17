package springTask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springTask.model.Discipline;
import springTask.model.Intern;
import springTask.model.Mentor;

@Configuration
@ComponentScan(value = "springTask.model")
public class ConfigClass {

    @Bean
    public Mentor getMentor() {
        Mentor mentor = new Mentor();
        return mentor;
    }

}
