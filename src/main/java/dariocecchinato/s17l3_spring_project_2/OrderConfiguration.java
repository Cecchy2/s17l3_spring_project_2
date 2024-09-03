package dariocecchinato.s17l3_spring_project_2;

import dariocecchinato.s17l3_spring_project_2.Enum.Stato;
import dariocecchinato.s17l3_spring_project_2.Enum.StatoOrdine;
import dariocecchinato.s17l3_spring_project_2.entities.Menu;
import dariocecchinato.s17l3_spring_project_2.entities.MenuData;
import dariocecchinato.s17l3_spring_project_2.entities.Ordine;
import dariocecchinato.s17l3_spring_project_2.entities.Tavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class OrderConfiguration {

    @Bean
    public Tavolo defaultTavolo() {
        return new Tavolo(1, 6, Stato.OCCUPATO);
    }

    @Bean
    public List<Ordine> createOrders(Menu menu, Tavolo tavolo) {
        List<Ordine> orders = new ArrayList<>();

        List<MenuData> ordineList1 = new ArrayList<>();
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Margherita")).findAny().orElse(null));
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Margherita")).findAny().orElse(null));
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Salami Pizza")).findAny().orElse(null));
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Water")).findAny().orElse(null));
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Wine")).findAny().orElse(null));
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Water")).findAny().orElse(null));
        ordineList1.add(menu.getDatas().stream().filter(menuData -> menuData.getNome().equals("Lemonade")).findAny().orElse(null));

        Ordine order1 = new Ordine(tavolo, ordineList1, 1, StatoOrdine.IN_CORSO, 4);
        orders.add(order1);

        return orders;
    }
}
