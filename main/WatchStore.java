/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class WatchStore implements Store{
       ArrayList<Time> time;  
       
       WatchStore(){
           time = new ArrayList<>();
       }
       
       @Override
       public void getTime(Time t){
           time.add(t);
       }
       
       @Override
       public void getInfo(){
           if (time.size() == 0)
               System.err.println("Магазин пуст");
           else{
             Comparator<Time> comp = new Comparator<Time>() {
                 @Override
                 public int compare(Time o1, Time o2) {
                     return o1.GetPrice() > o2.GetPrice() ? 1:-1;
                 }
             };
             System.err.println(Collections.max(time, comp).GetName());
             System.err.println(Collections.max(time, comp).GetPrice());
           }   
       }
       
       @Override
       public void setTime(int _hou, int _min, int _sec){
          for (Time t : time){
              t.GetStartTime(_hou, _min, _sec);
          }
       }
       
       @Override 
       public String getPopName(){
           HashMap<String, Integer> map = new HashMap<>();
           for (Time t : time){
               if (map.containsKey(t.GetName()))
                   map.put(t.GetName(), map.get(t.GetName())+1);
               else
                   map.put(t.GetName(), 1);
           }
           int max = 0;
           for (Integer m : map.values())
               if (m > max)
                   max = m;
           for (String m : map.keySet())
               if (map.get(m) == max)
                   return m;
           return "Магазин пуст";
        }
}
