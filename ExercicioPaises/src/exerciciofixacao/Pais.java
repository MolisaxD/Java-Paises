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
public class Pais {
    private String codigoISO;
    private String nome;
    private int populacao;
    private float tamanho;
    private ArrayList<Pais> paisesFronteira;

    public Pais() {
    }

    public Pais(String codigoISO, String nome, int populacao, float tamanho) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.tamanho = tamanho;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public ArrayList<Pais> getPaisesFronteira() {
        return paisesFronteira;
    }

    public void setPaisesFronteira(ArrayList<Pais> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    } 
    
    public boolean checarISO(Pais pais) {
        boolean igual = this.codigoISO.equals(pais.codigoISO);
        return igual;
    }
    
    public void checarDensidadePopulacional() {
        double densidade = this.populacao / this.tamanho;
        System.out.println(densidade);
    }
    
    public void checarFronteiras(Pais pais) {
        if(this.paisesFronteira.contains(pais)) {
            System.out.println("Estes dois países fazem fronteira.");
        } else {
            System.out.println("Estes dois países não fazem fronteira.");
        }
    }
    
    public void checarFronteirasComuns(Pais pais) {
        ArrayList<Pais> fronteirasComuns = new ArrayList<>();
        
        for(int i = 0; i < this.getPaisesFronteira().size(); i++) {
            for (int l = 0; l < pais.getPaisesFronteira().size(); l++) {
                if(this.getPaisesFronteira().get(i) == pais.getPaisesFronteira().get(l)) {
                    fronteirasComuns.add(this.paisesFronteira.get(i));
                }
            }
        }
        fronteirasComuns.forEach((vizinho) -> {
            System.out.println(vizinho.getNome());
        });
    }
    
}
