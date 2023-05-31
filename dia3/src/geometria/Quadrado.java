/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author ficdev
 */
public class Quadrado {
    
    private double lado;
    private double lado1;
    
    public Quadrado(double lado, double lado1) {
        this.lado = lado;
        this.lado1 = lado1;
    }
    
    public double calcularArea() {
        return this.lado * this.lado1;
    }    
    
    public double calcularPerimetro() {
        return 2 * (this.lado + this.lado1);
    }
}
