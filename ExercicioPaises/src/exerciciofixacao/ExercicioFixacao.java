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
public class ExercicioFixacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criar países
        Pais bra = new Pais("BRA", "Brasil", 214000000, 8510000f);
        Pais arg = new Pais("ARG", "Argentina", 45810000, 2780000f);
        Pais chi = new Pais("CHI", "Chile", 19490000, 756626f);
        Pais uru = new Pais("URU", "Uruguai", 3426000, 176215f);
        Pais per = new Pais("PER", "Peru", 33720000, 1285000f);
        Pais par = new Pais("PAR", "Paraguai", 6704000, 406752f);
        Pais bol = new Pais("BOL", "Bolívia", 12080000, 1099000f);
        Pais equ = new Pais("EQU", "Equador", 17800000, 256370f);
        Pais col = new Pais("COL", "Colômbia", 51520000, 1142000f);
        Pais ven = new Pais("VEN", "Venezuela", 28200000, 916445f);
        
        //Estabelecer fronteiras do Brasil
        ArrayList<Pais> fronteiraBr = new ArrayList<>();
        fronteiraBr.add(arg); fronteiraBr.add(uru); fronteiraBr.add(per); fronteiraBr.add(par);
        bra.setPaisesFronteira(fronteiraBr);
        
        //Estabelecer fronteiras da Argentina
        ArrayList<Pais> fronteiraAr = new ArrayList<>();
        fronteiraAr.add(bra); fronteiraAr.add(chi); fronteiraAr.add(uru); fronteiraAr.add(par);
        arg.setPaisesFronteira(fronteiraAr);
        
        //Estabelecer fronteiras do Chile
        ArrayList<Pais> fronteiraCh = new ArrayList<>();
        fronteiraCh.add(arg); fronteiraCh.add(per);
        chi.setPaisesFronteira(fronteiraCh);
        
        //Estabelecer fronteiras do Uruguai
        ArrayList<Pais> fronteiraUr = new ArrayList<>();
        fronteiraUr.add(bra); fronteiraUr.add(arg);
        uru.setPaisesFronteira(fronteiraUr);
        
        //Estabelecer fronteiras do Peru
        ArrayList<Pais> fronteiraPe = new ArrayList<>();
        fronteiraPe.add(bra); fronteiraPe.add(chi);
        per.setPaisesFronteira(fronteiraPe);
        
        //Estabelecer fronteiras do 
        
        //Testar igualdade semântica
        if(bra.checarISO(arg)) {
            System.out.println("São o mesmo país");
        } else {
            System.out.println("São países diferentes");
        }
        
        //Testar checar fronteiras
        bra.checarFronteiras(chi);
        
        //Testar densidade populacional
        bra.checarDensidadePopulacional();
        
        //Testar fronteiras comuns
        bra.checarFronteirasComuns(arg);
        
        //Parte 2
        Continente americaDoSul = new Continente();
        //Adicionar paises ao continente
        americaDoSul.adicionarPais(bra); americaDoSul.adicionarPais(arg); americaDoSul.adicionarPais(chi); americaDoSul.adicionarPais(uru);
        americaDoSul.adicionarPais(per); americaDoSul.adicionarPais(par); americaDoSul.adicionarPais(bol); americaDoSul.adicionarPais(equ);
        americaDoSul.adicionarPais(col); americaDoSul.adicionarPais(ven);
        
        
        //Testar tamanho do continente
        System.out.println(americaDoSul.calcularTamanho());
    }
    
}
