/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Clock_2 implements Time{
    int hou, min, sec, price ;
    String name ;
    
    public Clock_2(){
        hou = 0;
        min = 0;
        sec = 0;
        name = "";
        price = 0;
    }
    public Clock_2(int _hou, int _min, int _sec, String _name, int _price){
        hou = _hou;
        min = _min;
        sec = _sec;
        name = _name;
        price = _price;
    }
    public Clock_2(Clock_2 c){
        this(c.hou, c.min, c.sec, c.name, c.price);
    }
    
    @Override
    public String GetName(){
        return name;
    }
    
    @Override
    public int GetPrice(){
        return price;
    }
    
    @Override    
    public void GetStartTime(int _hou, int _min, int _sec){
        hou = _hou;
        min = _min;
        sec = _sec;
    }
    
    @Override
    public void ChangeTime(int _hou, int _min, int _sec) throws timeException{
        if ((_hou < 0)||(_min < 0)||(_sec < 0)) throw new timeException(1, "Error");
        hou += _hou;
        min += _min;
        sec += _sec;
    }   
}
