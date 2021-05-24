/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public class NoArvoreBinaria<T> {

    private T info;
    private NoArvoreBinaria esquerda;
    private NoArvoreBinaria direita;

    public NoArvoreBinaria(T info) {
        this.info = info;
        esquerda = null;
        direita = null;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        this.info = info;
        this.esquerda = esq;
        this.direita = dir;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria direita) {
        this.direita = direita;
    }
    
    
}
