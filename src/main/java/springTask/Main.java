package springTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springTask.config.ConfigClass;
import springTask.model.Discipline;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Discipline disciplineBean = context.getBean(Discipline.class);
        System.out.println(disciplineBean.getMentor().getIntern().getName());
    }
}
