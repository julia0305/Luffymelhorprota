/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class Externa {
     private int valor = 10;
    
    public class Interna {
        public void imprimeValor() {
           System.out.println("O valor da classe" + valor);
        }
    }
    
    public static void main (String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.imprimeValor();
      }
