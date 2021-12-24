package etu.Poly_exe;

import java.sql.SQLOutput;

public class class_base {
    int count  = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends class_base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
