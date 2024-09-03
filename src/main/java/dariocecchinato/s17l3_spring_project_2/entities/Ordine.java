package dariocecchinato.s17l3_spring_project_2.entities;

import dariocecchinato.s17l3_spring_project_2.Enum.StatoOrdine;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.List;


public class Ordine {
    private final Tavolo tavolo;
    private final List<MenuData> datas;
    private final int numeroOrdine;
    private final StatoOrdine statoOrdine;
    private final int numeroCoperti;
    private LocalDate oraAcquisizione;
    private final double importoTotale;

    @Value("${costo.coperto}")
    private double costoCoperto;

    public Ordine(Tavolo tavolo, List<MenuData> datas, int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti) {
        this.tavolo = tavolo;
        this.datas = datas;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = LocalDate.now();
        this.importoTotale = calcolaTotale();
    }

    public double calcolaTotale(){
        double totale = numeroCoperti * costoCoperto;
        for (MenuData data: datas){
            totale+= data.getPrezzo();
        }
        return totale;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "tavolo=" + tavolo +
                ", datas=" + datas +
                ", numeroOrdine=" + numeroOrdine +
                ", statoOrdine=" + statoOrdine +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisiziope=" + oraAcquisizione +
                ", importoTotale=" + importoTotale +
                '}';
    }
}
