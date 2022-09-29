/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.farmfromuser;

import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class FarmFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Pocet hus] [Pocet kraliku]");
        int pocetHus = sc.nextInt();
        int pocetKraliku = sc.nextInt();
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = pocetHus*2 + pocetKraliku*4;
        System.out.println(String.format("Pocet hus: %d\nPocet kraliku: %d\nNa farme je %d zvirat a maji %d nohou.",pocetHus, pocetKraliku, pocetZvirat, pocetNohou));
    }
}
