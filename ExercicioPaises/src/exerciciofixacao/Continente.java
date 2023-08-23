/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofixacao;

import java.util.ArrayList;

/**
 *
 * @author mborges
 */
public class Continente {
    private String nome;
    private ArrayList<Pais> paises = new ArrayList<>();
    private float tamanho, populacao;

    public Continente() {
    }

    public Continente(String nome) {
        this.nome = nome;
    }
    
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }
    
    public float calcularTamanho() {
        tamanho = 0;
        for(Pais pais: paises) {
            tamanho = tamanho + pais.getTamanho();
        }
        return tamanho;
    }
    
    public float calcularPopulacao() {
        populacao = 0;
        for(Pais pais: paises) {
            populacao = populacao + pais.getPopulacao();
        }
        return populacao;
    }
     
}
