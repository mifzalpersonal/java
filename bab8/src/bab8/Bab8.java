/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8;

import javax.swing.JOptionPane;

/**
 *
 * @author Mifzal
 */
public class Bab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    for (int a = 0; a < 10; a++) {
        System.out.println("Halo Dunia");
    }
    
    System.out.println("---");
    //
    
    for (int a = 2; a < 12; a += 2) {
        System.out.println("Bilangan Genap : " + a);
    }
    
    System.out.println("---");
    //
        
    int baris = 5;

    for (int i = 0; i <= baris; i++) {

    for (int j = 0; j < i; j++) {
        System.out.print("* ");
    }

    System.out.println("");}
    
    System.out.println("---");
    
    int jumlahKelas = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan jumlah kelas : ","Input",JOptionPane.INFORMATION_MESSAGE));
    
String isiKelas[][] = new String[jumlahKelas][];

for (int kelas = 0; kelas < jumlahKelas; kelas++)
{String namaKelas = JOptionPane.showInputDialog(null, "Namakelas :", "Masukan Nama Kelas",JOptionPane.INFORMATION_MESSAGE);

int jumlahKursi = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah murid masing - masing kelas : ","Input",
JOptionPane.INFORMATION_MESSAGE)); 
isiKelas[kelas] = new String[jumlahKursi];

System.out.println("Kelas " + namaKelas + " : "); for (int kursi = 0; kursi < jumlahKursi; kursi++) {
    String namaSiswa = JOptionPane.showInputDialog(null, "Nama Siswa", "Kelas " + namaKelas, JOptionPane.INFORMATION_MESSAGE);

isiKelas[kelas][kursi] = namaSiswa;

System.out.println("Nama Siswa " + isiKelas[kelas][kursi]);}
System.out.println("----------------------------------------");
 }
 
System.out.println("----");

int arr[] = new int[4];
boolean hasil = true;
arr[0] = 2;
arr[1] = 5;
arr[2] = 7; 
arr[3] = 1;

while (hasil == true) {
    String input = JOptionPane.showInputDialog(null,"masukan bilangan bulat :");

int cekInputan = Integer.parseInt(input);
for (int a = 0; a < 4; a++) {
    if (cekInputan == arr[a]) {

        hasil = false;
        break;
    } 
    
    else {hasil = true;}
}
if (hasil == true) {JOptionPane.showMessageDialog(null, "Angka " + cekInputan + " tidak ada di dalam array.");

} 
else {
JOptionPane.showMessageDialog(null, "Angka " + cekInputan + " ada di dalam array.");
    }
}

System.out.println("----");

String input = "";
int cekbil = 0;
do{
    input = JOptionPane.showInputDialog(null, "4 x 3 :");

    cekbil = Integer.parseInt(input); 
}

while(cekbil != 12);
        
    
    
    
    
/////////////////    
    }
    
}
