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
public class OddThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.print(" " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
        }
        System.out.println();
    }
}
