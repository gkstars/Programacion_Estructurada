import javax.swing.*;

public class ejercicio14 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x:"));
        double suma = 0;
        for (int i = 1, j = 1; i <= n; i++, j += 3) {
            suma += Math.pow(x, 3) / (3 * i) / j;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + suma);
    }
}
