/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ficdev
 */
public class Papelaria {

    public static void main(String[] args) {
        String produto;

        String[] menudeitens = new String[7];
        menudeitens[0] = "mochila:55.55";
        menudeitens[1] = "Caderno:9.99";
        menudeitens[2] = "Lapis:0.99";
        menudeitens[3] = "Borracha:0.99";
        menudeitens[4] = "Apontador:2.99";
        menudeitens[5] = "Lapiseira:2.99";
        menudeitens[6] = "Caneta:1.99";

        String menu = "menu de itens\n";
        for (int i = 0; i < 7; i++) {
            menu += menudeitens[i] + "\n";
        }

        while (true) {

            produto = String.format(JOptionPane.showInputDialog(menu + "escolha seu produto: "));

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar outra compra?");
            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }

    }
}
