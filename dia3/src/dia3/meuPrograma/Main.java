/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia3.meuPrograma;

import geometria.Retangulo;

import geometria.Quadrado;

/**
 *
 * @author ficdev
 */
// Definido a classe Main
public class Main {
    
    // Método principal do programa
    public static void main(String[] args) {
        
        // Criando um objeto da classe Retangulo com base 5 e altura 10
        Retangulo retangulo = new Retangulo(5, 10);
        Quadrado quadrado = new Quadrado(5.0, 5.0);
        
        // Calculando a área e o perímetro do retângulo
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        double volume = quadrado.calcularArea();
        double espaço = quadrado.calcularPerimetro();
        
        // Imprimindo os resultados na tela
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        System.out.println("Área do Quadrado: " + area);
        System.out.println("Perímetro do Quadrado: " + perimetro);
    }
}
