import javax.swing.*;

public class ejercicio11 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int suma = 0;
        for (int i = 1; i < n; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + n + " es: " + suma);
    }
}
