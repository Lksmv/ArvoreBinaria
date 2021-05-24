/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class ArvoreBinariaTest {

    public ArvoreBinariaTest() {
    }

    @Test
    public void test3ToString() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);

        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);

        System.out.println(arvore.toString());
        System.out.println("<1<2<><4<><>>><3<5<><>><6<><>>>>");
        System.out.println(arvore.contarNos());
    }

    @Test
    public void test2NaoVazia() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(5);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);

        assertEquals(false, arvore.estaVazia());
    }

}
