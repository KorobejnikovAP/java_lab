
package main;

public interface Store {
   void getTime(Time t);
   void setTime(int _hou, int _min, int _sec);
   void getInfo();
   String getPopName(); 
}
