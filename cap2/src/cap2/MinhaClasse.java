/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap2;

/**
 *
 * @author ficdev
 */
public class MinhaClasse {
    // Variáveis de instância
    private int valor1;
    private int valor2;

//construtor
public MinhaClasse(int v1, int v2) {
    this.valor1 = v1;
    this.valor2 = v2;
}    

//métodos
public int somar() {
    return this.valor1 + this.valor2;
}

public int subtrair() {
    return this.valor1 - this.valor2;
}

}
