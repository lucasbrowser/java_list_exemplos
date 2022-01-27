/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.javalistexemplos.domain;



/**
 *
 * @author lucas
 */
public class ServicoItem {
    
    private Long codigo;
    private String descricao;
    private Double valor;
    private Servico servico;

    public ServicoItem(Long codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public ServicoItem(Long codigo, String descricao, Double valor, Servico servico) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.servico = servico;
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

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    
    
    @Override
    public String toString() {
        return getDescricao();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ServicoItem) {
            ServicoItem s = (ServicoItem) o;
            if (s.getCodigo() == this.getCodigo()) {
                return true;
            }
        }
        return false;
    }
    
}
