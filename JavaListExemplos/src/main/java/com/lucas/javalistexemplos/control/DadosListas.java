/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.control;

import com.lucas.javalistexemplos.domain.Pessoa;
import com.lucas.javalistexemplos.domain.Produto;
import com.lucas.javalistexemplos.domain.Servico;
import com.lucas.javalistexemplos.domain.ServicoItem;
import com.lucas.javalistexemplos.domain.Venda;
import com.lucas.javalistexemplos.domain.VendaItem;
import java.util.Date;
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
    
    public static Venda carregarVendas(){
         
        Venda venda = new Venda(1l, "Lucas Oliveira", new Date("26/01/2022"), 1200.00);
        
        Produto produto1 = new Produto(1, 100.00, 5);
        Produto produto2 = new Produto(2, 250.00, 2);
        
        VendaItem item1 = new VendaItem(1l, produto1, venda, 5l, 100.00);
        VendaItem item2 = new VendaItem(2l, produto2, venda, 2l, 250.00);
        
        venda.getItens().add(item1);
        venda.getItens().add(item2);
        
        Servico servico = new Servico(1l, "Garantia", 100.00, 1l, item1, "G");
        Servico servico2 = new Servico(2l, "Garantia", 80.00, 2l, item2, "G");
        Servico servico3 = new Servico(1l, "Sorteio", 20.00, 0l, item1, "S");
        
        
        item1.getServicos().add(servico);
        item1.getServicos().add(servico3);
        item2.getServicos().add(servico2);
        
        ServicoItem itemServico1 = new ServicoItem(1l, "Garantia 1 Ano", 20.00, servico);
        ServicoItem itemServico2 = new ServicoItem(2l, "Garantia 1 Ano", 20.00, servico);
        ServicoItem itemServico3 = new ServicoItem(3l, "Garantia 1 Ano", 20.00, servico);
        ServicoItem itemServico4 = new ServicoItem(4l, "Garantia 1 Ano", 20.00, servico);
        ServicoItem itemServico5 = new ServicoItem(5l, "Garantia 1 Ano", 20.00, servico);
        
        ServicoItem itemServico6 = new ServicoItem(6l, "Garantia 2 Anos", 40.00, servico2);
        ServicoItem itemServico7 = new ServicoItem(7l, "Garantia 2 Anos", 40.00, servico2);
        
        ServicoItem itemServico8 = new ServicoItem(8l, "Sorteio de 1000,00", 10.00, servico3);
        ServicoItem itemServico9 = new ServicoItem(9l, "Sorteio de 1000,00", 10.00, servico3);
        
        servico.getServicoItens().add(itemServico1);
        servico.getServicoItens().add(itemServico2);
        servico.getServicoItens().add(itemServico3);
        servico.getServicoItens().add(itemServico4);
        servico.getServicoItens().add(itemServico5);
        
        servico2.getServicoItens().add(itemServico6);
        servico2.getServicoItens().add(itemServico7);
        
        servico3.getServicoItens().add(itemServico8);
        servico3.getServicoItens().add(itemServico9);
        
        return venda;
        
    }
    
}
