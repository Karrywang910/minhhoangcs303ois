/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vominhhoang.cs.pkg303.ois;

import java.util.Scanner;

public class VominhhoangCs303Ois {

    public static void main(String[] args) {
  Scanner scanner = new Scanner (System.in);
        System.out.println("nhap so nguyen thu nhat: ");
        int a = scanner.nextInt();
        System.out.println("nhap so nguyen thu hai: ");
        int b = scanner.nextInt();
        int tong = a + b ;
        int hieu = a - b ;
        int tich = a * b ;
        String thuong = (b != 0) ? String.valueOf((double) a / b) : "khong the chia cho 0";
        String du = (b != 0) ? String.valueOf(a % b) : "khong the lay du voi 0";
        System.out.println("tong: " + tong);
        System.out.println("hieu:" + hieu);
        System.out.println("tich:" + tich);
        System.out.println("thuong:" + thuong);
        System.out.println("du:" + du);
        
        
        
        
                
        
        
        
        
        
                
    }
    
}