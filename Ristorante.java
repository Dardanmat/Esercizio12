package esercizi.esercizio12;
import java.util.ArrayList;

public class Ristorante {
    
    private ArrayList<Piatto> menu;
    private ArrayList<Ordine> listaOrdini;
    
    private String nomeRistorante;
    
    //metodi per modifica ordini 
    public boolean addOrdine(Ordine o){
        return listaOrdini.add(o);
    }
    public boolean removeOrdine(int numeroOrdine){
        for(int i = 0; i < listaOrdini.size(); i++){ 
            if(numeroOrdine == listaOrdini.get(i).getNumeroOrdine()){
                listaOrdini.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //metodi per modifica menu 
    public boolean addPiatto(Piatto p){
        return menu.add(p);
    }
    public boolean removePiatto(String nome){
        for(int i = 0; i < menu.size(); i++){ 
            if(nome.equals(menu.get(i).getNome())){
                menu.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //per la creazione della lista dei piatti di un certo tipo, in ordine di prezzo
    public ArrayList<Piatto> listaPiattiPerTipo(String tipo){
        ArrayList<Piatto> lista = new ArrayList<>();
        
        for(int i = 0; i < menu.size(); i++){
            if(menu.get(i).getTipo().equals(tipo)){
                lista.add(menu.get(i));
            }
        }
        lista.sort(new ComparaPrezzo());
        return lista;
    }
    
    //per la creazione della lista degli ordini di un certo cameriere, in ordine di tavolo
    public ArrayList<OrdineTavolo> listaOrdiniDiCameriere(String nome){
        ArrayList<OrdineTavolo> lista = new ArrayList<>();
        
        for(int i = 0; i < listaOrdini.size(); i++){
            if(listaOrdini.get(i) instanceof OrdineTavolo){
                
                OrdineTavolo o = (OrdineTavolo)listaOrdini.get(i);
                if(o.getNomeCameriere().equals(nome)) lista.add((OrdineTavolo)listaOrdini.get(i));
            }
        }
        lista.sort(new ComparaTavolo());
        return lista;
    }
    
    //per la creazione della lista degli ordini per orario di consegna
    public ArrayList<OrdineDomicilio> listaOrdiniPerOrarioConsegna(String nome){
        ArrayList<OrdineDomicilio> lista = new ArrayList<>();
        
        for(int i = 0; i < listaOrdini.size(); i++){
            if(listaOrdini.get(i) instanceof OrdineDomicilio){
                
                OrdineDomicilio o = (OrdineDomicilio)listaOrdini.get(i);
                lista.add((OrdineDomicilio)listaOrdini.get(i));
            }
        }
        lista.sort(new ComparaOra());
        return lista;
    }
    
    
}
