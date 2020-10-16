package springTask.model;

import org.springframework.stereotype.Component;

@Component
public class Mentor {

    private Intern intern;

    public Mentor(Intern intern) {
        this.intern = intern;
    }

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }
}
