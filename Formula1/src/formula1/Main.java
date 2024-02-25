/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formula1;

/**
 *
 * @author Rifqi Abbiyu
 */
public class Main {
    
public static void main(String[] args) {
        Format.Qualifications quali = new Format.Qualifications();
        Format.Race rce = new Format.Race();
        
        System.out.println("hasil kualifikasi");
        System.out.println("Posisi = 1 \n" + quali.Position1 + "\n");
        System.out.println("posisi = 2 \n" + quali.Position2 + "\n");
        System.out.println("posisi = 3 \n" + quali.Position3 + "\n");
        System.out.println("posisi = 4 \n" + quali.Position4 + "\n");
        System.out.println("Hasil Race");
        System.out.println("p1 = \n" + rce.P1 + "\n");
        System.out.println("p2 = \n" + rce.P2 + "\n");
        System.out.println("p3 = \n" + rce.P3 + "\n");
        System.out.println("p4 = \n" + rce.P4 + "\n");
    }
    
}
