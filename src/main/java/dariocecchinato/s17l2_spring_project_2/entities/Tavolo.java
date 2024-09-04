package dariocecchinato.s17l2_spring_project_2.entities;

import dariocecchinato.s17l2_spring_project_2.Enum.Stato;
import lombok.Getter;
import lombok.Setter;


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

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getNumeroCopertiMax() {
        return numeroCopertiMax;
    }

    public void setNumeroCopertiMax(int numeroCopertiMax) {
        this.numeroCopertiMax = numeroCopertiMax;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
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
