/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.esercizio12;

/**
 *
 * @author darda
 */
public class Ingrediente {
    
    private String descrizione;
    private int qta;
    private double prezzoUnitario;

    public Ingrediente(String descrizione, int qta, double prezzoUnitario) {
        this.descrizione = descrizione;
        this.qta = qta;
        this.prezzoUnitario = prezzoUnitario;
    }
    
    public double getPrezzo(){
        return prezzoUnitario * qta;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }
}
