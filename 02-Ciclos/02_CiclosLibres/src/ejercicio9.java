import javax.swing.*;

public class ejercicio9 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }
}
