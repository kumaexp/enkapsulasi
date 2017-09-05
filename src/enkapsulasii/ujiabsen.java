/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasii;

/**
 *
 * @author Ser Veresta
 */
public class ujiabsen {
 public static void main(String args[]){
     encapsiswa siswa = new encapsiswa();
     siswa.setName("Andre");
     siswa.setAge(5);
     siswa.setAddress("Malang");
     
     System.out.print("Name: " + siswa.getName() + " Absen: " + siswa.getAbsen()
             + " Address: " + siswa.getAddress());
 }   
}
