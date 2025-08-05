/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab4;

/**
 *
 * @author Mifzal
 */
public class Bab4 { 
    
    public static String variabel1;
    public static String variabel2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("variabel1 -> " + variabel1);
        System.out.println("variabel2 -> " + variabel2);
        System.out.println("Setelah diisi!");
        variabel1 = "Hello";
        variabel2 = "World!";
        System.out.println("variabel1 -> " + variabel1);
        System.out.println("variabel2 -> " + variabel2);
        System.out.println("----");

        
        
        
       //konversi konvensional 
        String var1 = "123456789";
        String var2 = "3.14";
        String var3 = "1";

        int bulat = Integer.parseInt(var1);
        double pecahan = Double.parseDouble(var2);
        short bulat2 = Short.parseShort(var3);
        
        System.out.println("variabel 1 = " + var1);
        System.out.println("variabel 2 = " + var2);
        System.out.println("variabel 3 = " + var3);
        System.out.println("---");
        
        System.out.println("konversi bilangan bulat " + bulat);
        System.out.println("konversi bilangan pecahan " + pecahan);
        System.out.println("konversi bilangan bulat2 " + bulat2);
        System.out.println("----");
        
        
        //tipe casting
        int vars1 = 5;
        int vars2 = 3;

        System.out.println("Hasil : "+ vars1 / vars2);
        
        int varss1 = 5;
        int varss2 = 3;

        System.out.println("Hasil : "+ (double)varss1 / varss2);
    }
    
}
