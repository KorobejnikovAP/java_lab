/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class Main {

    public static void main(String[] args) {
        Time t1 = new Clock_1(12, 34, "sitizen", 10000);
        Time t2 = new Clock_1(12, 34, "sitizen", 15000);
        Time t3 = new Clock_1(12, 34, "sitizen", 17000);
        Time t4 = new Clock_2(12, 34, 50, "Rolex", 20000);
        Time t5 = new Clock_2(11, 14, 50, "Rolex", 70000);
        
        Store store = new WatchStore();
        store.getTime(t1);
        store.getTime(t2);
        store.getTime(t3);
        store.getTime(t4);
        store.getTime(t5);
        
        store.getInfo();
        store.setTime(1, 1, 1);
        System.err.println(store.getPopName());
        
    }
}
