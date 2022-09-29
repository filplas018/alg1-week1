/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sentencefromargv;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Filip Plass
 */
public class SentenceFromArgv {

    public static void main(String[] args) {
        System.out.println("[Jméno] [Rok] [Třída]");
        String name = args[0];
        int rok = Integer.parseInt(args[1]);
        String trida = String.format("%d.%s",Calendar.getInstance().get(Calendar.YEAR)-rok-6, args[2] );
        System.out.println(String.format("Dite %s ma %d let a chodi do %s.",name,Calendar.getInstance().get(Calendar.YEAR)-rok,trida));
    }
}
