/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public interface Time {
    String GetName();
    int GetPrice();
    void GetStartTime (int _hou, int _min, int _sec);
    void ChangeTime (int _hou, int _min, int _sec)throws timeException;
}

    