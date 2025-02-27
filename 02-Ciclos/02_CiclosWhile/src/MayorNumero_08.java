import javax.swing.*;

public class MayorNumero_08 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números:"));
        int i = 0;
        double mayor = Double.MIN_VALUE;
        while (i < n) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            if (numero > mayor) {
                mayor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El mayor valor es " + mayor);
    }
}