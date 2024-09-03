package dariocecchinato.s17l3_spring_project_2;

import dariocecchinato.s17l3_spring_project_2.entities.Ordine;
import dariocecchinato.s17l3_spring_project_2.entities.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Tavolo tavolo;

    @Autowired
    private List<Ordine> orders;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Table details: " + tavolo);


        for (Ordine order : orders) {
            System.out.println(order);
        }
    }
}
