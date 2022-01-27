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
public class VendaItem {
    
    private Long codigo;
    private Produto produto;
    private Venda venda;
    private Long quantidade;
    private Double valorUnitario;
    private List<Servico> servicos = new LinkedList<>();

    public VendaItem(Long codigo, Produto produto, Venda venda, Long quantidade, Double valorUnitario) {
        this.codigo = codigo;
        this.produto = produto;
        this.venda = venda;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
    

 
    
}
