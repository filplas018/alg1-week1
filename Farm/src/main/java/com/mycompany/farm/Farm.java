/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.farm;
/**
 *
 * @author Filip Plass
 */
public class Farm {

    public static void main(String[] args) {
        System.out.println("[Pocet hus] [Pocet kraliku]");
        int pocetHus = 5;
        int pocetKraliku = 4;
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = pocetHus*2 + pocetKraliku*4;
        System.out.println(String.format("Pocet hus: %d\nPocet kraliku: %d\nNa farme je %d zvirat a maji %d nohou.",pocetHus, pocetKraliku, pocetZvirat, pocetNohou));
        
    }
}
