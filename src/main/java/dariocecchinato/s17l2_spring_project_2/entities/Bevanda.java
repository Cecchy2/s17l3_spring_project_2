package dariocecchinato.s17l2_spring_project_2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevanda extends MenuData {

    public Bevanda(String nome, double prezzo, int valoriNutrizionali) {
        super(nome, prezzo, valoriNutrizionali);
    }

    @Override
    public String toString() {
        return "• Drink: " + getNome()+ " prezzo "+ getPrezzo() + "  " + getValoriNutrizionali()+ " Cal";
    }
}
