/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlakna;

/**
 *
 * @author Ondra
 */

public class Vlakna {
    public static int i=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Run v1 = new Run();
        Run v2 = new Run();
        Run v3 = new Run();
        
        Thread CT1 = new Thread(v1);
        Thread CT2 = new Thread(v2);
        Thread CT3 = new Thread(v3);
        CT3.start();
        CT2.start();
        CT1.start();
        
    }
}
