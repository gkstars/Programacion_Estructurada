import javax.swing.*;

public class ejercicio12 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, n + (esPrimo ? " es primo" : " no es primo"));
    }
}
