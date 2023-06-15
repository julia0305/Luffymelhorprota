/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia5;

/**
 *
 * @author ficdev
 */
public class CelularTeste {
    public static void main (String[] args) {
        Celular celular = new Celular();
        celular.modelo = "Samsung";
        celular.ano = 2019;
        
        CelularAndroid android = new CelularAndroid();
        android.modelo = "Android";
        android.ano = 2023;
    }
}
