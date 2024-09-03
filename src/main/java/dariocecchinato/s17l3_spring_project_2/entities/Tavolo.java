package dariocecchinato.s17l3_spring_project_2.entities;

import dariocecchinato.s17l3_spring_project_2.Enum.Stato;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Getter
@Setter

public class Tavolo {

    private int numeroTavolo;

    private int numeroCopertiMax;

    private Stato stato;

    public Tavolo(int numeroTavolo, int numeroCopertiMax, Stato stato) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMax = numeroCopertiMax;
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", numeroCopertiMax=" + numeroCopertiMax +
                ", stato=" + stato +
                '}';
    }
}
