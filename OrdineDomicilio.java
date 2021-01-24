package esercizi.esercizio12;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;


public class OrdineDomicilio extends Ordine{
    private static double prezzoConsegna = 5; //prezzo aggiuntivo all'ordine consegnato a domicilio
    private String indirizzo;
    private GregorianCalendar oraDiConsegna;

    public OrdineDomicilio(String indirizzo, ArrayList<Piatto> listaPiatti, int ora, int minuti) {
        super(listaPiatti);
        this.indirizzo = indirizzo;
        oraDiConsegna = new GregorianCalendar(1, 1, 1, ora, minuti);
    }

    public GregorianCalendar getOraDiConsegna() {
        return oraDiConsegna;
    }

    public void setOraDiConsegna(GregorianCalendar oraDiConsegna) {
        this.oraDiConsegna = oraDiConsegna;
    }
    
    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    @Override
    public double getPrezzo() {
        return super.getPrezzo() + prezzoConsegna;
    }
    
}
