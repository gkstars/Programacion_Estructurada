import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:");
        int numero = Integer.parseInt(numeroStr);

        if (numero < 0) {
            JOptionPane.showMessageDialog
                    (null, "El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            JOptionPane.showMessageDialog
                    (null, String.format("El factorial de %d es: %d", numero, factorial));
        }
    }
}

