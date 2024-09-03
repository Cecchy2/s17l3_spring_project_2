package dariocecchinato.s17l3_spring_project_2.entities;

import dariocecchinato.s17l3_spring_project_2.Enum.Stato;
import org.springframework.beans.factory.annotation.Autowired;



public class Tavolo {

    private int numeroTavolo;

    private int numeroCopertiMax;

    private Stato stato;

    public Tavolo(int numeroTavolo, int numeroCopertiMax, Stato stato) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMax = numeroCopertiMax;
        this.stato = stato;
    }
}
