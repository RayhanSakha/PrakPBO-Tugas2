/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Balok {
    double length , width , height;

    public Balok(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double luasPersegi (){
        return length*width;
    }
    public double volume (){
       return length*width*height; 
    }
    public double luasPermukaan (){
        return (length*width+length*height+width*height)*2;
    }
    public double keliling (){
        return (length+width)*2;
    }
}
