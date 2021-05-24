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
public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, T info) {
        if (no == null) {
            return false;
        } else {
            return no.getInfo() == info || pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
        }
    }

    public String toString() {
        return arvorePre(raiz);

    }

    private String arvorePre(NoArvoreBinaria<T> no) {

        if (no == null) {
            return "<>";
        } else {
            return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
        }
    }

    public int contarNos() {
        return contarNos(this.raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }

}
