/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

/**
 *
 * @author hp
 */
public class Multix implements Runnable{
    public void run() {
    System.out.println("Thread implement is running");
}
public static void main(String args[]){
    Multix m1 = new Multix();
    Thread t1 = new Thread(m1);
    t1.start();
  }
}