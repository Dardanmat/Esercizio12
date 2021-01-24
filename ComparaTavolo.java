package esercizi.esercizio12;
import java.util.Comparator;

public class ComparaTavolo implements Comparator<OrdineTavolo>{
    
    @Override
    public int compare(OrdineTavolo o1, OrdineTavolo o2) {
        if(o1.getNumeroTavolo()==o2.getNumeroTavolo()) return 0;
        if(o1.getNumeroTavolo()>o2.getNumeroTavolo()) return -1;
        if(o1.getNumeroTavolo()<o2.getNumeroTavolo()) return 1;
        return 0;
    }
    
}
