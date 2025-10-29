package calculo;

import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        String entrada1 = JOptionPane.showInputDialog("Digite um número");
        String entrada2 = JOptionPane.showInputDialog("Digite mais um número");

        int num1 = parseInt(entrada1);
        int num2 = parseInt(entrada2);

        int sum = num1 + num2;

        String message = String.format("A soma de %d com %d é igual a %d.", num1, num2, sum);

        JOptionPane.showMessageDialog(null, message);

    }
}