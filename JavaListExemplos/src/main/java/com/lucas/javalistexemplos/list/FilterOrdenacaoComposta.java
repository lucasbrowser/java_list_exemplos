/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.list;

import static com.lucas.javalistexemplos.control.DadosListas.carregarEstoque;
import com.lucas.javalistexemplos.domain.Estoque;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lucas
 */
public class FilterOrdenacaoComposta {
    
    public static void main(String[] args) {
        
        List<Estoque> lEstoque = carregarEstoque();
        
        /**
        * Ordenar o estoque pelo estoque normal
        */
        List<Estoque> lEstoqueOrdenado = lEstoque.stream()
                .sorted((first, second) -> first.getCodigo().compareTo(second.getCodigo()))
                .collect(Collectors.toList());
        
        System.out.println("\nLista de Estoque Ordenado\n");
        lEstoqueOrdenado.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Descrição: "+p.getDescricao()+", Saldo: "+(p.getQuantidade() - p.getQuantidadeReservada())));
        
        /**
        * Ordenar o estoque pelo saldo
        */
        List<Estoque> lEstoqueOrdenadoSaldo = lEstoque.stream()
                .sorted(Comparator.comparing(e -> (e.getQuantidade() - e.getQuantidadeReservada())))
                .collect(Collectors.toList());
        Collections.reverse(lEstoqueOrdenadoSaldo);
        lEstoqueOrdenadoSaldo.stream()
                .sorted((first, second) -> first.getCodigo().compareTo(second.getCodigo()))
                .collect(Collectors.toList());
        
        System.out.println("\nLista de Estoque Ordenado pelo Saldo\n");
        lEstoqueOrdenadoSaldo.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Descrição: "+p.getDescricao()+", Saldo: "+(p.getQuantidade() - p.getQuantidadeReservada())));
    }
    
}
