package springTask.model;

import org.springframework.stereotype.Component;

@Component
public class Intern {
    private String name = "Valeria";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
