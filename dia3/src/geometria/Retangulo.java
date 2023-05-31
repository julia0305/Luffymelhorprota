/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author ficdev
 */
// Definindo a classe Retangulo
public class Retangulo {
    
    // Propriedades do retângulo
    private double base;
    private double altura;
    
    // Construtor da Classe
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Método para calcular a área do retângulo
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}
