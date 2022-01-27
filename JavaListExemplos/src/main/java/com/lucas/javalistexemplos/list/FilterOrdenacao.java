/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.list;

import static com.lucas.javalistexemplos.control.DadosListas.carregarPessoas;
import com.lucas.javalistexemplos.domain.Pessoa;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author lucas
 */
public class FilterOrdenacao {
    
    public static void main(String[] args) {
        List<Pessoa> lPessoas = carregarPessoas();
        
        System.out.println("\nLista de Pessoas Cadastradas");
        lPessoas.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Nome: "+p.getNome()+", Idade: "+p.getIdade()+", Cidade: "+p.getCidade()+", UF: "+p.getEstado()));
        
        /**
        * Identificar dentre os cadastros não ordenados,
        * a pessoa mais velha e mais nova da lista.
        */
        System.out.println("");
        Pessoa pessoaMaisNova = lPessoas.stream().min(Comparator.comparingInt(Pessoa::getIdade)).get(); 
        System.out.println("Pessoa Mais Nova: "+pessoaMaisNova.getNome()+", "+pessoaMaisNova.getIdade());
        Pessoa pessoaMaisVelha = lPessoas.stream().max(Comparator.comparingInt(Pessoa::getIdade)).get(); 
        System.out.println("Pessoa Mais Velha: "+pessoaMaisVelha.getNome()+", "+pessoaMaisVelha.getIdade());
        double mediaIdade = lPessoas.stream().mapToInt(Pessoa::getIdade).average().getAsDouble();
        System.out.println("Média de Idade: "+mediaIdade+" anos.");
        long quantidadePessoas = lPessoas.stream().mapToLong(p -> p.getCodigo()).count(); 
        System.out.println("Quantidade de Pessoas: "+quantidadePessoas);


        
        /**
        * Trecho abaixo para configurar a ordenação da lista.
        * A lista será ordenada pelo nome.
        */
        List<Pessoa> lPessoaOrdenadaNome = lPessoas.stream()
                .sorted((first, second) -> first.getNome().compareTo(second.getNome()))
                .collect(Collectors.toList());
        
        /**
        * Trecho abaixo para identificar o último nome da lista
        * 
        */
        String nome = lPessoaOrdenadaNome.stream()
                .reduce((first, second) -> second)
                .get().getNome();
        
        System.out.println("\nLista Ordenada em Ordem Alfabética pelo Nome\n");
        lPessoaOrdenadaNome.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Nome: "+p.getNome()+", Idade: "+p.getIdade()+", Cidade: "+p.getCidade()+", UF: "+p.getEstado()));
        System.out.println("\nÚltimo nome da lista ordenada: "+nome);
        
        /**
        * .
        * A lista será ordenada pela idade.
        */
        List<Pessoa> lPessoaOrdenadaIdade = lPessoas.stream()
                .sorted(Comparator.comparingInt(Pessoa::getIdade))
                .collect(Collectors.toList());
        
        /**
        * Trecho abaixo para identificar a pessoa mais velha
        * 
        */
        int idade = lPessoaOrdenadaIdade.stream()
                .reduce((first, second) -> second)
                .get().getIdade();
        
        System.out.println("\nLista Ordenada pela Idade\n");
        lPessoaOrdenadaIdade.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Nome: "+p.getNome()+", Idade: "+p.getIdade()+", Cidade: "+p.getCidade()+", UF: "+p.getEstado()));
        System.out.println("\nPessoa Mais Velha: "+idade);
        
        /**
        * .
        * A lista será ordenada pela idade, do mais velho para o mais novo
        */
        List<Pessoa> lPessoaOrdenadaIdadeReversa = lPessoas.stream()
                .sorted(Comparator.comparingInt(Pessoa::getIdade).reversed())
                .collect(Collectors.toList());
        
        System.out.println("\nLista Ordenada pela Idade do Maior para o Menor\n");
        lPessoaOrdenadaIdadeReversa.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Nome: "+p.getNome()+", Idade: "+p.getIdade()+", Cidade: "+p.getCidade()+", UF: "+p.getEstado()));
        
        /**
        * .
        * Lista de Pessoas do Rio de Janeiro em ordem alfabética
        */
        List<Pessoa> lPessoaRJOrdenada = lPessoas.stream()
                .filter(p -> p.getEstado().equals("RJ"))
                .sorted((first, second) -> first.getNome().compareTo(second.getNome()))
                .collect(Collectors.toList());
        
        System.out.println("\nLista RJ em Ordem Alfabética\n");
        lPessoaRJOrdenada.stream().forEach(p -> System.out.println("Id: "+p.getCodigo()+", "
                + "Nome: "+p.getNome()+", Idade: "+p.getIdade()+", Cidade: "+p.getCidade()+", UF: "+p.getEstado()));
        
    }
    
}
