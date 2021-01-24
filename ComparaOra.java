package esercizi.esercizio12;
import java.util.Comparator;

public class ComparaOra implements Comparator<OrdineDomicilio>{
    
    @Override
    public int compare(OrdineDomicilio o1, OrdineDomicilio o2) {
        return o1.getOraDiConsegna().compareTo(o2.getOraDiConsegna());
    }
    
}
