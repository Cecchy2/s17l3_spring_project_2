package dariocecchinato.s17l3_spring_project_2;

import dariocecchinato.s17l3_spring_project_2.Enum.Stato;
import dariocecchinato.s17l3_spring_project_2.Enum.StatoOrdine;
import dariocecchinato.s17l3_spring_project_2.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@Component
public class MyRunner implements CommandLineRunner {
@Autowired
    private Menu menu;


    @Override
    public void run(String... args) throws Exception {


        Tavolo tavolo1 = new Tavolo(1,6, Stato.OCCUPATO);

        List<MenuData>ordineList= new ArrayList<>();

        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Margherita")).findAny().orElse(null));
        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Margherita")).findAny().orElse(null));
        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Salami Pizza")).findAny().orElse(null));
        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Water")).findAny().orElse(null));
        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Wine")).findAny().orElse(null));
        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Water")).findAny().orElse(null));
        ordineList.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Lemonade")).findAny().orElse(null));

        Ordine order1 = new Ordine(tavolo1, ordineList, 1, StatoOrdine.IN_CORSO, 4);
        System.out.println(order1);
    }
}
