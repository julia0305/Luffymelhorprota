/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4;

import java.util.Scanner;
/**
 *
 * @author ficdev
 */
public class NPrimos {
    
    public static void main(String[] args) {
        
        try (Scanner nn = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            
            int numero = nn.nextInt();
            boolean primo = true;
            
            if (numero < 2) {
                primo = false;
            } else {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println(numero + " é primo");
            } else {
                System.out.println(numero + " não é primo");
            }
    
        }        
    
    }
       
}
