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
public class Cadastro {
    public static void main(String[] args) {
        
        String[][] alunos = new String[50][3];
        int aluno = 0;
        
        while (true) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");            
            int idade =
        Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno: "));
            double nota = 
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do aluno: "));
            
            alunos[aluno][0] = nome;
            alunos[aluno][1] = Integer.toString(idade);
            alunos[aluno][2] = Double.toString(nota);
            aluno++;
            
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?");
            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }    
    
        String listaAlunos = "Lista de alunos\n" ;
        double totalNotas = 0.0;
        for (int i = 0; i < aluno; i++) {
            listaAlunos  += alunos[i][0] + " _ " + alunos[i][1] + "anos - Nota: " + alunos[i][2] + "n\";"
             + "totalNotas += Double.paseDouble(alunos[i][2])";
        }
        double mediaNotas = totalNotas / aluno;
        listaAlunos += "\nMédia das notas: " + mediaNotas;
        JOptionPane.showMessageDialog(null, listaAlunos);                    
    }
}

