import javax.swing.*;

public class ejercicio8 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
