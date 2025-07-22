/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyekbaru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mifzal
 */
public class ProyekBaru {

    public static void main (String[] args)  throws IOException {
        
       String namaBeneranDepan = "";
       String namaBeneranBelakang = "";
//buat objek dari inputStream
        InputStreamReader ireader = new InputStreamReader(System.in);
        
//buat objek bufferreader
        BufferedReader breader = new BufferedReader(ireader);
        System.out.println("Nama Depan : ");
        
//membaca inputan user
        namaBeneranDepan = breader.readLine();
        System.out.println("Nama Belakang : ");

//membaca inputan user
        namaBeneranBelakang = breader.readLine();
        System.out.println("Nama Saya adalah :");
        System.out.println(namaBeneranDepan + " " + namaBeneranBelakang);
    
 //dapi bilang
    String dapi = JOptionPane.showInputDialog("Masukin lagi : ");
    System.out.println("Nama : " + dapi);
    
    
    
  


//saya cinta linux bro tapi tak tau harus linux apa
//fedora berat, arch rasanya kaya ditinggalin sendiri, debian lemot apt, void takut ga semua apps jalan, manjaro katanya bloat

System.out.println("Hello" + " " + "world!"); System.out.println(2 + " " + 5);

System.out.println(2 + 5);

System.out.println("Angka " + "" + 5); System.out.println("2+5" + "=" + "25");

System.out.println("2+5" + "=" + (2 + 5));

String namaDepan = "";

String namaBelakang = "";

Scanner input = new Scanner(System.in);

System.out.println("Nama Depan : ");
     
      //nama depan 
    namaDepan = input.next();
     
      //print it out 
    System.out.println("Nama Belakang : ");
     
      //nama belakang 
    namaBelakang = input.next();

    System.out.println("Hai " + namaDepan + " " + namaBelakang + "!"); 
     
    
    
    
    
    //method show input dialog
    String nama = JOptionPane.showInputDialog("Masukan Nama: ");
        System.out.println("Nama : " + nama);
        
        
        
        
    //yah itulah pokoknya
        String a = JOptionPane.showInputDialog("Masukan nilaiuntuk variabel a : ");
        String b = JOptionPane.showInputDialog("Masukan nilaiuntuk variabel b : ");

        System.out.println("Hasil :" + (Integer.parseInt(a) * Integer.parseInt(b)));
    
        
        
      String Nama = "Budi";
        String jurusan = "Sistem Informasi";
        JOptionPane.showMessageDialog(null, "Halo " + Nama + ",jurusan Kamu " + jurusan);
        
        
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Informasi.","Informasi",
        JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Error !","Error",
        JOptionPane.ERROR_MESSAGE);
        
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Peringatan.","Peringatan",
        JOptionPane.WARNING_MESSAGE);
        
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Pertanyaan.", "Pertanyaan",
        JOptionPane.QUESTION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Plain Message.","Plain Message",
        JOptionPane.PLAIN_MESSAGE);
        
        
        
        int pertanyaan = JOptionPane.showConfirmDialog(null, "Pilih Yes atau No?", "Pertanyaan",JOptionPane.YES_NO_OPTION);

        if(JOptionPane.YES_OPTION == pertanyaan){
           JOptionPane.showMessageDialog(null, "Kamu memilih Yes.");
        }
        
        else if(JOptionPane.NO_OPTION == pertanyaan){
        JOptionPane.showMessageDialog(null, "Kamu memilih No.");
        }
    }
}
    
