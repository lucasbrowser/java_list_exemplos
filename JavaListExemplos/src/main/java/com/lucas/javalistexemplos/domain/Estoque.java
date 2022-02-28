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
public class Estoque {
    
    private String codigo;
    private String descricao;
    private int quantidade;
    private int quantidadeReservada;
    private int saldo;

    public Estoque(String codigo, String descricao, int quantidade, int quantidadeReservada) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.quantidadeReservada = quantidadeReservada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeReservada() {
        return quantidadeReservada;
    }

    public void setQuantidadeReservada(int quantidadeReservada) {
        this.quantidadeReservada = quantidadeReservada;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
