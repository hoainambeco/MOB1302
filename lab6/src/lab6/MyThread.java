/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author namxg
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("số " +i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
