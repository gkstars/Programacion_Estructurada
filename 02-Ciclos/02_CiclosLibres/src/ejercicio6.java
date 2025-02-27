import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = 0;
        String sucesion = "";
        for (int i = 1; i <= n; i++) {
            int cuadrado = i * i;
            suma += cuadrado;
            sucesion += cuadrado + " ";
        }
        JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma: " + suma);
    }
}
