/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi.esercizio12;

import java.util.ArrayList;

/**
 *
 * @author darda
 */
public class OrdineTavolo extends Ordine{
    private int numeroTavolo;
    private String nomeCameriere;

    public OrdineTavolo(int numeroTavolo, String nomeCameriere, ArrayList<Piatto> listaPiatti) {
        super(listaPiatti);
        this.numeroTavolo = numeroTavolo;
        this.nomeCameriere = nomeCameriere;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public String getNomeCameriere() {
        return nomeCameriere;
    }

    public void setNomeCameriere(String nomeCameriere) {
        this.nomeCameriere = nomeCameriere;
    }
}
