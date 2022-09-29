/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tosecondsfromuser;

import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class ToSecondsFromUser {

    public static void main(String[] args) {
        //vstup, data zadaná uživatelem PO spuštění programu nahrána do proměnných
        Scanner sc = new Scanner(System.in);
        System.out.println("[Hodiny] [Minuty] [Sekundy]");
        int hodiny = sc.nextInt();
        int minuty = sc.nextInt();
        int sekundy = sc.nextInt();
        
        //zde níže je inicializována nová proměnná a následně vypsána
        //výstup
        int celkemSekund = hodiny*3600 + minuty*60 + sekundy;
        System.out.println(String.format("%d", celkemSekund));
    }
}
