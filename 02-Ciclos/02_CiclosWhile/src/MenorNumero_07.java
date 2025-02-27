import javax.swing.*;

public class MenorNumero_07 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));
        int i = 0;
        double menor = Double.MAX_VALUE;
        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero < menor) {
                menor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El menor valor es " + menor);
    }
}
