/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computadoras;

/**
 *
 * @author Armando
 */
public class MainStart {
    static void describir(Computadora i) {
	// ...
	i.Describir();
    }

    static void describirTodo(Computadora[] e) {
	for(int i = 0; i < e.length; i++)
	    describir(e[i]);
    }
    public static void main(String[] args) {
        Computadora[] arrayCompus = new Computadora[4];
        int i = 0;
	arrayCompus[i++] = new Electrica();
	arrayCompus[i++] = new EnergySource();
	arrayCompus[i++] = new Heat();
	arrayCompus[i++] = new Mechanical();
	describirTodo(arrayCompus);
    }
}
