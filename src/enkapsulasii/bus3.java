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
public class bus3 {
    public int penumpang;
    public int maxpenumpang;
    
  public bus3(int maxpenumpang){
      this.maxpenumpang = maxpenumpang;
      penumpang = 0;
  }
  public void addpenumpang(int penumpang){
      int temp;
      temp = this.penumpang + penumpang;
      if(temp > maxpenumpang){
          System.out.println("penumpang melebihi kuota");
      }
      else{
      this.penumpang=temp;
      }
  }
  public void getpenumpang(int password){
      if(password == 24){
          System.out.println("Passowrd Benar!");
      }
      else{
      System.out.println("Password Salah!");
      }
  }
  public void cetakpenumpang(){
      System.out.println("Penumpang Bus Sekarang= " + penumpang);
      System.out.println("Penumpang Bus Yang Seharusnya= " + maxpenumpang);
      
  }
}
