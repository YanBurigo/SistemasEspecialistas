/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yanbu
 */
public class Serie {
    
    private String nome;
    private String categoria;
    private boolean lancamento;
    private String origem;

    public Serie(String nome, String categoria, boolean lancamento, String origem) {
        this.nome = nome;
        this.categoria = categoria;
        this.lancamento = lancamento;
        this.origem = origem;
    }

    public Serie() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
   
}
