package esercizi.esercizio12;
import java.util.ArrayList;

public class Piatto {
    
    private String nome;
    private String tipo; //primo, secondo, dessert, antipasto ecc...
    private ArrayList<Ingrediente> listaIngredienti;

    public Piatto(String nome, String tipo, ArrayList<Ingrediente> listaIngredienti) {
        this.nome = nome;
        this.tipo = tipo;
        this.listaIngredienti = listaIngredienti;
    }

    public Piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.listaIngredienti = new ArrayList<>();
    }
    
    public Piatto() {
        this.nome = "";
        this.tipo = "";
        this.listaIngredienti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Ingrediente> getListaIngredienti() {
        return listaIngredienti;
    }
    
    public void getListaIngredienti(ArrayList<Ingrediente> a) {
        listaIngredienti = a;
    }

    public void setListaIngredienti(ArrayList<Ingrediente> listaIngredienti) {
        this.listaIngredienti = listaIngredienti;
    }
    
    public double getPrezzo(){
        double prezzo = 0;
        for(int i = 0; i < listaIngredienti.size(); i++){
            
            prezzo += listaIngredienti.get(i).getPrezzo(); 
            
        }
        return prezzo;
    }
    
    public boolean addIngrediente(Ingrediente i){    
        return listaIngredienti.add(i);
    }
    
    public boolean removeIngrediente(String desc){    
        for(int i = 0; i < listaIngredienti.size(); i++){ 
            if(desc.equals(listaIngredienti.get(i).getDescrizione())){
                listaIngredienti.remove(i);
                return true;
            }
        }
        return false;
    }
}
