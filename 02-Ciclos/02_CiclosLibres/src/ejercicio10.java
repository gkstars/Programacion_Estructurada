import javax.swing.*;

public class ejercicio10 {
    public static void main(String[] args) {
        String impares = "";
        for (int i = 1; i < 100; i += 2) {
            impares += i + " ";
        }
        JOptionPane.showMessageDialog(null, "Números impares entre 0 y 100: " + impares);
    }
}
