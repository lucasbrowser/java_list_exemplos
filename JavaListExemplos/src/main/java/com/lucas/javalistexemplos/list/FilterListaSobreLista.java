/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.list;


import static com.lucas.javalistexemplos.control.DadosListas.carregarVendas;
import com.lucas.javalistexemplos.domain.Venda;


/**
 *
 * @author lucas
 */
public class FilterListaSobreLista {
    
    public static void main(String[] args) {
        
        Venda venda = carregarVendas();
        
        System.out.println("\nVenda Cadastrada\n");
        System.out.println("\nID: "+venda.getCodigo()+
                "\nCliente: "+venda.getCliente()+
                "\nData: "+venda.getDataVenda()+
                "\nValor: "+venda.getValorTotal());
        
        
        System.out.println("Somar itens com serviços de sorteio");
        for (int i = 0; i < venda.getItens().size(); i++) {
            double qtdServicoItens = venda.getItens().get(i).getServicos().stream()
                    .filter(p -> p.getTipo().equals("S"))
                    .mapToDouble(s -> s.getServicoItens().stream()
                    .mapToDouble(x -> x.getValor()).sum()).sum();
            
            System.out.println("Qtd: "+qtdServicoItens);
        }
        
        
        String tipo = "S";
        
        /**
        * Identificar a quantidade de serviços do tipo G tem na venda
        */    
        Long qtdServicoGarantia = venda.getItens().stream()
                .flatMap(serv -> serv.getServicos().stream())
                    .filter(p -> p.getTipo().equals(tipo))
                    .mapToLong(m -> m.getCodigo()).count();
        System.out.println("\nQuantidade de Serviços com Tipo "+tipo);
        System.out.println("Qtd Serviços: "+qtdServicoGarantia);
        
        /**
        * Identificar a quantidade de itens com serviço do tipo G tem na venda
        */
        Long qtdItensServicoGarantia = venda.getItens().stream()
                .flatMap(serv -> serv.getServicos().stream()
                    .filter(p -> p.getTipo().equals(tipo)))
                        .flatMap(s -> s.getServicoItens().stream())
                        .mapToLong(c -> c.getCodigo()).count();


        System.out.println("\nQuantidade de Itens de Serviços com Tipo "+tipo);
        System.out.println("Qtd Itens de Serviços: "+qtdItensServicoGarantia);
        
    }
    

    
}
