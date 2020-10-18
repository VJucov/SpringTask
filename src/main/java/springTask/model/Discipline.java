package springTask.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Discipline {
    private String name = "Applications Management";

    @Autowired
    @Qualifier("Rustam")
    private Mentor mentor;

    public Discipline(Mentor mentor) {
        this.mentor = mentor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}