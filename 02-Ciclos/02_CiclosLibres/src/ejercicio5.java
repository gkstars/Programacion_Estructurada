import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        int suma = 0;
        String sucesion = "";
        for (int i = 20; i <= n; i += 5) {
            suma += i;
            sucesion += i + " ";
        }
        JOptionPane.showMessageDialog(null, "Sucesión: " + sucesion + "\nSuma: " + suma);
    }
}
