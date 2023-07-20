/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfis;

/**
 *
 * @author Slime1
 */
public class Circle extends Shape {
     private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public String getName() {
        return "Circle";
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
   
    
}
