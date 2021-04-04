/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.mg4;

/**
 *
 * @author user
 */
public class Tugas2Mg4 {
Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("         Do_While            ");
        System.out.println("Bilangan Keliapatan 2 (0-100)");
        System.out.println("=============================");
        int a = 1;
        
        do {
            System.out.print("  " + a);
            a = (a*2);
        } while ( a <= 100);
        
    }
    
}
    