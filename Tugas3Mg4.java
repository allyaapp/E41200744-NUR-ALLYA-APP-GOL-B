/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.mg4;

import java.util.Scanner;

public class Tugas3Mg4 {

    public static void main(String[] args) {
        int nilai[] = new int[7];
        int jumlah_nilai = 0;
        double average = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Masukkan banyak data nilai = ");
        jumlah_nilai = scan.nextInt();
        
        System.out.println("Masukkan data nilai ke-1 = 23 ");
        nilai[1] = scan.nextInt();
        
        System.out.println("Masukkan data nilai ke-2 = 69");
        nilai[2] = scan.nextInt();
        
        System.out.println("Masukkan data nilai ke-3 = 98");
        nilai[3] = scan.nextInt();
        
        System.out.println("Masukkan data nilai ke-4 = 30");
        nilai[4] = scan.nextInt();
        
        int a[] = { nilai[1], nilai[2], nilai[3], nilai[4]};
        int min = a[0];
        int max = a[0];
        for (int i = 0; i<a[0]; i++){
            if(min > a[0]){
                min = a[0];
            }
            if(max < a[0]){
                max = a[0];
            }
        }
        System.out.println("Nilai Minimum = " + min);
        System.out.println("Nilai Maximum = " + max);
        
        average = (nilai[1] + nilai[2] + nilai[3] + nilai[4]/4);
        
        System.out.println("Rata-rata = " + average);
    }
    
}
