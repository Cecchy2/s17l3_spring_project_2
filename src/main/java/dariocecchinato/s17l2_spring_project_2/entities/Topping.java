package dariocecchinato.s17l2_spring_project_2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends MenuData {


    public Topping(String nome, double prezzo, int valoriNutrizionali) {
        super(nome, prezzo, valoriNutrizionali);
    }

    @Override
    public String toString() {
        return "• Topping: " + getNome() + " prezzo" + getPrezzo() + " valori Nutrizionali " + getValoriNutrizionali();
    }
}

