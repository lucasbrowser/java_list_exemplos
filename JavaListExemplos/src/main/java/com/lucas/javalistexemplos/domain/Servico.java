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
public class Servico {
    
    private Long codigo;
    private String descricao;
    private Double valor;
    private Long tempoServico;
    private VendaItem vendaItem;
    private String tipo;
    private List<ServicoItem> servicoItens = new LinkedList<>();


    public Servico(Long codigo, String descricao, Double valor, Long tempoServico, VendaItem vendaItem, String tipo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.tempoServico = tempoServico;
        this.vendaItem = vendaItem;
        this.tipo = tipo;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(Long tempoServico) {
        this.tempoServico = tempoServico;
    }
    

    public List<ServicoItem> getServicoItens() {
        return servicoItens;
    }

    public void setServicoItens(List<ServicoItem> servicoItens) {
        this.servicoItens = servicoItens;
    }

    public VendaItem getVendaItem() {
        return vendaItem;
    }

    public void setVendaItem(VendaItem vendaItem) {
        this.vendaItem = vendaItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    @Override
    public String toString() {
        return getDescricao();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Servico) {
            Servico s = (Servico) o;
            if (s.getCodigo() == this.getCodigo()) {
                return true;
            }
        }
        return false;
    }
    
}
