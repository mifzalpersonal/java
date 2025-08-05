/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5;

/**
 *
 * @author Mifzal
 */
public class Bab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //increment
    Integer sebelum = 20;  
    
    Integer sesudah = 0;

    System.out.println("Sebelum Increment : " + sebelum);
    sesudah = ++sebelum;
    System.out.println("Sesudah Increment : " + sesudah);
    
        System.out.println("----");
        
    //decrement
    Integer sebelum1 = 20;

    Integer sesudah1 = 0;

    System.out.println("Sebelum Decrement : " + sebelum1);
    sesudah1 = --sebelum1;
    System.out.println("Sesudah Decrement : " + sesudah1);
    
        System.out.println("----");
        
    //negasi
    int a = 2;
    int b = 0;

    System.out.println("Sebelum negasi : " + a);
    b = -a;
    System.out.println("Sesudah negasi : " + b);
    
        System.out.println("---");
   
    //Penambahan 
    int a1 = 10; 
    int a2 = 2;
    System.out.println("Penambahan 10 + 2 : " + (a1 + a2));
    
    //Pengurangan 
    int b1 = 10; 
    int b2 = 2;
    System.out.println("Pengurangan 10 - 2 : " + (b1 - b2));
    
    //Perkalian
    int c1 = 16;
    int c2 = 2;
    System.out.println("Perkalian 16 * 2 : " + (c1 * c2));
    
    //Pembagian
    int d1 = 16;
    int d2 = 2;
    System.out.println("Pembagian 16 / 2 : " + (d1 / d2));
    
    //Sisa Bagi
    int e1 = 16;
    int e2 = 2;
    System.out.println("Sisa bagi 16 dan 2 : " + (e1 %e2));
    
        System.out.println("---");
    
    System.out.println("Operator Bilangan Bulat Relasional");
   
    int aa = 10;
    int bb = 15;
    System.out.println("Variabel a : " + aa);
    System.out.println("Variabel b : " + bb);
    System.out.println("Apakah 10 kurang dari 15? " + (aa < bb));
    System.out.println("Apakah 15 kurang dari 10? " + (bb < aa));
    System.out.println("Apakah 10 kurang dari 10? " + (bb < bb));
    
        System.out.println("---");
    
    int ab = 2;
    int bc = 3;
    System.out.println("Variabel a : " + ab);
    System.out.println("Variabel b : " + bc);
    System.out.println("Apakah 2 lebih besar dari 3 " + (ab > bc));
    System.out.println("Apakah 3 lebih besar dari 2 " + (bc < ab));
    System.out.println("Apakah 3 lebih besar dari 3 " + (bc < bc));
    
        System.out.println("---");
        
    int ac = 3;
    int be = 3;
    System.out.println("Variabel a : " + ac);
    System.out.println("Variabel b : " + be);
    System.out.println("Apakah 3 lebih kecil atau sama dengan 3 " + (ac <= be));
    ac = 2;
    System.out.println("Variabel a diubah : " + ac);
    System.out.println("Apakah 9 lebih kecil atau sama dengan 3 " + (ac <= be));
        
        System.out.println("---");

    int ax = 3;
    int bx = 3;
    System.out.println("Variabel a : " + ax);
    System.out.println("Variabel b : " + bx);
    System.out.println("Apakah 3 sama dengan 3 " + (ax == bx)); 
    ax = 2;
    System.out.println("Apakah 2 sama dengan 3 " + (ax == bx));
    System.out.println("Apakah 2 tidak sama dengan 3 " + (ax != bx));
    
        System.out.println("---");

    System.out.println("true and true : " + (true && true));
    System.out.println("true and false : " + (true && false));
    System.out.println("false and false : " + (false && false));
    System.out.println("false and true : " + (false && true));
    
        System.out.println("---");

    System.out.println("true or true : " + (true || true));
    System.out.println("true or false : " + (true || false));
    System.out.println("false or false : " + (false || false));
    System.out.println("false or true : " + (false || true));
    
    }
    
}
