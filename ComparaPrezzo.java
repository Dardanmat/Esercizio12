package esercizi.esercizio12;
import java.util.Comparator;

public class ComparaPrezzo implements Comparator<Piatto>{
    
    @Override
    public int compare(Piatto o1, Piatto o2) {
        if(o1.getPrezzo()==o2.getPrezzo()) return 0;
        if(o1.getPrezzo()>o2.getPrezzo()) return -1;
        if(o1.getPrezzo()<o2.getPrezzo()) return 1;
        return 0;
    }
    
}
