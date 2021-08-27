/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.list;

import static com.lucas.javalistexemplos.domain.DadosListas.carregarPessoas;
import com.lucas.javalistexemplos.domain.Pessoa;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class FilterExemplos {
    
    public static void main(String[] args) {
        
        List<Pessoa> lPessoas = carregarPessoas();
        
        System.out.println("Lista de Pessoas Cadastradas");
        lPessoas.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Nome: "+p.getNome()+", Idade: "+p.getIdade()+", Cidade: "+p.getCidade()+", UF: "+p.getEstado()));
    }
    

    
}
