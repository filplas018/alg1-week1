/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sentence;

/**
 *
 * @author Filip Plass
 */
import java.util.Scanner;
import java.util.Calendar;
public class Sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Jméno] [Rok] [Třída]");
        String name = "Filip";
        int rok = 2009;
        String trida = String.format("%d.%s",Calendar.getInstance().get(Calendar.YEAR)-rok-6, "A" );
        System.out.println(String.format("Dite %s ma %d let a chodi do %s.",name,Calendar.getInstance().get(Calendar.YEAR)-rok,trida));
    }
}
