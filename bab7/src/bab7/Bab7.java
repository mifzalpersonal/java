/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7;

import javax.swing.JOptionPane;

/**
 *
 * @author Mifzal
 */
public class Bab7 {

    //private static String[][] newString;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Cara 1
String[] nama1;

//Cara 2 
String nama2[];

//Cara3
String[] nama3 = new String[2];

System.out.println("---");

String nama[] = new String[3];
nama[0] = "Budi";
nama[1] = "Andi";
nama[2] = "Dwi";

System.out.println("Index 0 : "+nama[0]);
System.out.println("Index 1 : "+nama[1]);
System.out.println("Index 2 : "+nama[2]);

System.out.println("---");
       

String[] namas = new String[3];

namas[0] = JOptionPane.showInputDialog(null,"Nama :","index ke-0",JOptionPane.INFORMATION_MESSAGE);

namas[1] = JOptionPane.showInputDialog(null,"Nama :","index ke-1",JOptionPane.INFORMATION_MESSAGE);

namas[2] = JOptionPane.showInputDialog(null,"Nama :","index ke-2",JOptionPane.INFORMATION_MESSAGE);

JOptionPane.showMessageDialog(null, namas[0]+", "+namas[1]+","+namas[2]);

System.out.println("----");

String umur[][] = new String[2][2];
umur[0][0] = "Budi";
umur[0][1] = "20";
umur[1][0] = "Andi";
umur[1][1] = "45";

System.out.println("Nama : "+umur[0][0]+" umur : "+umur[0][1]);
System.out.println("Nama : "+umur[1][0]+" umur : "+umur[1][1]);

    }
    
}
