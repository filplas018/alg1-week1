/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tosecondsfromargv;

/**
 *
 * @author Filip Plass
 */
public class ToSecondsFromArgv {

    public static void main(String[] args) { //args může obdahovat parametry
        //vstup, hodnoty z args (parametry při spuštění programu) do proměnných
        int hodiny = Integer.parseInt(args[0]);
        int minuty = Integer.parseInt(args[1]);
        int sekundy = Integer.parseInt(args[2]);
        
        //zde níže je inicializována nová proměnná a následně vypsána
        //výstup
        int celkemSekund = hodiny*3600 + minuty*60 + sekundy;
        System.out.println(String.format("%d", celkemSekund));
    }
}
