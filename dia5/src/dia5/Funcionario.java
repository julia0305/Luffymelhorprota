/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia5;

/**
 *
 * @author ficdev
 */
public class Funcionario {
   
    private String nome;
    private String cpf;
    private double salario;
            
    public double getBonificacao() {
        return this.salario * 0.10;
    }
}
