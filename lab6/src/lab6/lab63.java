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
public class lab63 {

    public static void main(String[] args) {
        Thread th1 = new Thread(new OddThread());
        Thread th2 = new Thread(new EvenThread());
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {}
        th2.start();
    }
}
