/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaemjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Vítor
 */
public class NotaAluno {
    public static void main(String[] args) {
        int cont = 0;
        String alunos = JOptionPane.showInputDialog("Informe a quantidade de alunos: "); 
        int quant = Integer.parseInt(alunos);
        System.out.println("Alunos:" + alunos);
        for (int i = 0; i < quant; i++){
            String situacao = null;
            String nome = JOptionPane.showInputDialog("Informe o nome do Aluno: ");
            
            String n1 = JOptionPane.showInputDialog("Informe a primeira nota: "); 
            float nota1 = Float.parseFloat(n1);
            String n2 = JOptionPane.showInputDialog("Informe a segunda nota: "); 
            float nota2 = Float.parseFloat(n2);
            
            double media = (nota1 + nota2)/2;
            
            if (media >= 7) {
                situacao = "Aprovado";
            }
            else{
                situacao = "Reprovado";
            }
            System.out.println("Aluno: " + nome + "\nMédia: " + media + "\nSituação: " + situacao);
            cont++;            
        }
        System.out.println("Quantidade de alunos: " + cont);
        Object[] opcoes = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Object avaliation = JOptionPane.showInputDialog(null, "Escolha uma nota",
                "Opção", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        System.out.println("Sua nota: " + avaliation);
    }
    
}
