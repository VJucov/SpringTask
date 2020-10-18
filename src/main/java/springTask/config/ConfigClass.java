package springTask.config;

import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("Dima")
    public Mentor getMentor() {
        Mentor mentor = new Mentor();
        mentor.setName("Dima");
        return mentor;
    }

    @Bean
    @Qualifier("Rustam")
    public Mentor getMentor2() {
        Mentor mentor = new Mentor();
        mentor.setName("Rustam");
        return mentor;
    }

    @Bean
    public Discipline getDiscipline() {
        Discipline discipline = new Discipline(getMentor());
        return  discipline;
    }

}
