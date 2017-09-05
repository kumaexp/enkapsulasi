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
public class ujibola {
    public static void main(String[] arg){
        bola hitung = new bola();
        double luas, volume;
        hitung.setjari(14);
        luas = hitung.showluas();
        volume = hitung.showvolume();
        System.out.println("Jari-jari adalah: "+hitung.showjari()+"\nDiameter adalah: "+hitung.showdiameter()+
                "\n Luas Bola= "+(int)Math.round(luas)+"\n Volume Bola= "+(int)Math.round(volume));
                
    }
}
