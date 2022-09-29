/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.swap;

/**
 *
 * @author Filip Plass
 */
import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte dvě čísla oddělena mezerou: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //1
        //a
        System.out.println(String.format("%d %d", b, a));
        //b
        int c = a;
        a = b;
        b = c;
        System.out.println(String.format("%d %d", a, b));
        //c
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(String.format("%d %d", a, b));
    }
}
