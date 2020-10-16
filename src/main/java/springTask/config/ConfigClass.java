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

//    @Bean
//    public Discipline getDiscipline() {
//        Discipline discipline = new Discipline();
//        discipline.setName("Applications Management");
//        discipline.setMentor(getMentor());
//        return discipline;
//    }
//
//    @Bean
//    public Intern getIntern() {
//        Intern intern = new Intern();
//        return intern;
//    }
//
//    @Bean
//    public Mentor getMentor() {
//        Mentor mentor = new Mentor();
//        mentor.setIntern(getIntern());
//        return mentor;
//    }

}
