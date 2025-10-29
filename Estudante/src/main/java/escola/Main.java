package escola;

import javax.swing.JOptionPane;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Digite o nome do primeiro aluno");
        String notaEntrada1 = JOptionPane.showInputDialog("Digite a media do primeiro aluno");

        String name2 = JOptionPane.showInputDialog("Digite o nome do segundo aluno");
        String notaEntrada2 = JOptionPane.showInputDialog("Digite a media do segundo aluno");

        double nota1 = parseDouble(notaEntrada1);
        double nota2 = parseDouble(notaEntrada2);

        Aluno account1 = new Aluno(name1, nota1);
        Aluno account2 = new Aluno(name2, nota2);

        String message1 = String.format("Aluno: %s \nNota: %s", account1.getName(), account1.getLetterGrade());
        String message2 = String.format("Aluno: %s \nNota: %s", account2.getName(), account2.getLetterGrade());

        JOptionPane.showMessageDialog(null, message1);
        JOptionPane.showMessageDialog(null, message2);

    }
}