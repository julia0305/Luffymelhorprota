/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class TestePessoa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
                
        p1.setNome("João");
        p1.setIdade(25);
                
        System.out.println("Seu nome é " + p1.getNome());
        System.out.println("Sua idade é " + p1.getIdade());
        
    }
}
