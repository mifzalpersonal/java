/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6;

import javax.swing.JOptionPane;

/**
 *
 * @author Mifzal
 */
public class Bab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String temp = JOptionPane.showInputDialog(null, "Masukan Angka", "Menentukan Ganjil Genap", JOptionPane.QUESTION_MESSAGE);
int input = Integer.parseInt(temp);
System.out.println((input %2)); 
if ((input % 2) == 0) 
{JOptionPane.showMessageDialog(null, "Angka : " + input + " " + "adalah bilangan GENAP", "Informasi", JOptionPane.INFORMATION_MESSAGE);}
else if ((input % 2) == 1) 
{JOptionPane.showMessageDialog(null, "Angka : " + input + " " + "adalah bilangan GANJIL", "Informasi",JOptionPane.INFORMATION_MESSAGE);}

System.out.println("----");

String umur = JOptionPane.showInputDialog(null, "Kamu umur berapa ?");

if (Integer.parseInt(umur) <= 5) 
{JOptionPane.showMessageDialog(null, "Balita");} 

else if (Integer.parseInt(umur) >= 6 && Integer.parseInt(umur) <= 11)
{ JOptionPane.showMessageDialog(null, "Anak - anak");} 

else if (Integer.parseInt(umur) >= 12 && Integer.parseInt(umur) <= 25)
{ JOptionPane.showMessageDialog(null, "Remaja");}

else {JOptionPane.showMessageDialog(null, "Dewasa");}

System.out.println("---");

String nilai = JOptionPane.showInputDialog
(null, "Masukan nilai :");
switch (nilai.toUpperCase()) {

case "A":
JOptionPane.showMessageDialog(null, "Sangat baik.");
break;

case "B":
JOptionPane.showMessageDialog(null, "Baik.");
break;

case "C":
JOptionPane.showMessageDialog(null, "Cukup.");
break;

case "D":
JOptionPane.showMessageDialog(null, "Jelek.");
break;

default :
JOptionPane.showMessageDialog(null,"Salah memasukan nilai !");
}
    }
    
}
