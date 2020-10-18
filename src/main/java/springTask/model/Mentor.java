package springTask.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Mentor {

    private String name;

    @Autowired
    private Intern intern;

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
