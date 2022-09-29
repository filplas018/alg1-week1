/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.toseconds;

/**
 *
 * @author Filip Plass
 */
public class ToSeconds {

    public static void main(String[] args) {
        //vstup, "natvrdo" přiřazené hodnoty;
        int hodiny = 1;
        int minuty = 1;
        int sekundy = 1;
        
        //zde níže je inicializována nová proměnná a následně vypsána
        //výstup
        int celkemSekund = hodiny*3600 + minuty*60 + sekundy;
        System.out.println(String.format("%d", celkemSekund));
    }
}
