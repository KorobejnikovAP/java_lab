/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Clock_1 implements Time {
    int hou, min, price ;
    String name ;
    
    public Clock_1(){
        hou = 0;
        min = 0;
        name = "";
        price = 0;
    }
    public Clock_1(int _hou, int _min, String _name, int _price){
        hou = _hou;
        min = _min;
        name = _name;
        price = _price;
    }
    public Clock_1(Clock_1 c){
        this(c.hou, c.min, c.name, c.price);
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
        this.hou = _hou;
        this.min = _min;
    }
    
    @Override
    public void ChangeTime(int _hou, int _min, int _sec) throws timeException{
        if ((_hou < 0)||(_min < 0)) throw new timeException(1, "Error");
        this.hou += _hou;
        this.min += _min;
    }
}
