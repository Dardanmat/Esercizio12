package esercizi.esercizio12;
import java.util.ArrayList;

public class Ordine {
    
    private static int numOrdini = 0;
    private int numOrdine;
    private ArrayList<Piatto> listaPiatti;

    public Ordine(ArrayList<Piatto> listaPiatti) {
        numOrdine = numOrdini + 1;
        numOrdini++;
        this.listaPiatti = listaPiatti;
    }
    
    public Ordine() {
        numOrdine = numOrdini + 1;
        numOrdini++;
        this.listaPiatti = new ArrayList<>();
    }

    public int getNumeroOrdine(){
        return numOrdine;
    }
    
    public double getPrezzo(){
        double prezzo = 0;
        for(int i = 0; i < listaPiatti.size(); i++){
            prezzo += listaPiatti.get(i).getPrezzo();  
        }
        return prezzo;
    }
    
    public boolean addPiatto(Piatto p){
        return listaPiatti.add(p);
    }
    
    public boolean removePiatto(String nome){
        for(int i = 0; i < listaPiatti.size(); i++){ 
            if(nome.equals(listaPiatti.get(i).getNome())){
                listaPiatti.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getNumOrdine() {
        return numOrdine;
    }

}
