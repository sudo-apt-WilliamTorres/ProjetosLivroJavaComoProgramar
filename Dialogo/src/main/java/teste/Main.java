package teste;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual o seu nome?");

        String message = String.format("Bem vindo, %s, ao programando em Java!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}