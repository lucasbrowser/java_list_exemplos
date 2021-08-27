/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class DadosListas {
    
    public static List<Pessoa> carregarPessoas(){
         
        Pessoa pessoa1 = new Pessoa(1, "Matheus Henrique", 18, "Rio de Janeiro", "SP");
        Pessoa pessoa2 = new Pessoa(2, "Hernandez Roja", 21, "São Paulo", "RJ");
        Pessoa pessoa3 = new Pessoa(3, "Mario Fernandes", 22, "Rio de Janeiro", "RJ");
        Pessoa pessoa4 = new Pessoa(4, "Neymar Junior", 28, "Santos", "SP");    
        Pessoa pessoa5 = new Pessoa(5, "Joana Marques", 25, "Niterói", "RJ");
        Pessoa pessoa6 = new Pessoa(6, "Jeferson Rodrigues", 31, "Belo Horizonte", "MG");
        
        List<Pessoa> lPessoa = new LinkedList<>();         
        lPessoa.add(pessoa1);          
        lPessoa.add(pessoa2);          
        lPessoa.add(pessoa3);          
        lPessoa.add(pessoa4); 
        lPessoa.add(pessoa5);
        lPessoa.add(pessoa6);
        
        return lPessoa;
        
      }
    
}
