import javax.swing.*;

public class ejercicio13 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de valores:"));
        int sumaPositivos = 0;
        int productoNegativos = 1;
        for (int i = 0; i < n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                productoNegativos *= numero;
            }
        }
        JOptionPane.showMessageDialog(null, "Suma de positivos: " + sumaPositivos + "\nProducto de negativos: " + productoNegativos);
    }
}
