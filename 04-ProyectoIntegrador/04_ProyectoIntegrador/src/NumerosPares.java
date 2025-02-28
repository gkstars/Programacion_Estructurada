import javax.swing.*;

public class NumerosPares {
    public static void main(String[] args) {
        StringBuilder pares = new StringBuilder("Números pares del 1 al 100:\n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                pares.append(i).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, pares.toString());
    }
}
