/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4;

import javax.swing.JOptionPane;
/**
 *
 * @author ficdev
 */
public class Cardapiodbebidas {
    
    public static void main(String [] args) {
        int licor;
        double preco = 0.0;
        
        String menu = "Cardapio de bebidas:\n" +
                      "1. Sangria\n" +
                      "2. Rossini\n" +
                      "3. Mojito\n" +
                      "4. Margarita\n";
        
       licor = Integer.parseInt(JOptionPane.showInputDialog(menu + "Opção desejada: "));
        
        switch (licor) {
            case 1 -> preco = 72.50;
            case 2 -> preco = 78.50;
            case 3 -> preco = 75.50;
            case 4 -> preco = 82.50;
            default -> JOptionPane.showMessageDialog(null, "Não temos essa bebida ");
        }    
        if (preco != 0.0) {
            JOptionPane.showMessageDialog(null, String.format("O preço da sua bebida é R$ %.2f", preco));
            }
    
    }
    
}

