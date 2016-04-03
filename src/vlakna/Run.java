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
public class Run implements Runnable {
    @Override
    public void run() {
       
        while(Vlakna.i<=50){
            synchronized(Vlakna.class){
                if(Vlakna.i>50){
                    Vlakna.i=51;
                }else{
                    System.out.println(Thread.currentThread().getName()+ ": "+Vlakna.i);
                    Vlakna.i++;
                }
            }
            for (long l = 0l; l < 1000000; l++) {}
       }
    }   
    
}
