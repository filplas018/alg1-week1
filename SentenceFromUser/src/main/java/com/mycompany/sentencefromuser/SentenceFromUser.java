/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sentencefromuser;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class SentenceFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Jméno] [Rok] [Třída]");
        String name = sc.next();
        int rok = sc.nextInt();
        String trida = String.format("%d.%s",Calendar.getInstance().get(Calendar.YEAR)-rok-6, sc.next() );
        System.out.println(String.format("Dite %s ma %d let a chodi do %s.",name,Calendar.getInstance().get(Calendar.YEAR)-rok,trida));
    }
}
