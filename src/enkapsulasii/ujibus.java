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
public class ujibus {
    public static void main(String[] args){
        bus busbesar = new bus(40);
        busbesar.cetak();
        
        busbesar.addPenumpang(15);
        busbesar.cetak();
        
        busbesar.addPenumpang(5);
        busbesar.cetak();
        
        busbesar.addPenumpang(26);
        busbesar.cetak();
        
        
    }
}
