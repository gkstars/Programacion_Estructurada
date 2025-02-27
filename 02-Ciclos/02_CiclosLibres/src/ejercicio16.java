import javax.swing.*;

public class ejercicio16 {
    public static void main(String[] args) {
        String numeros = "";
        for (int i = 1000; i >= 0; i--) {
            numeros += "\n" + i ;
        }
        JOptionPane.showMessageDialog(null, "Números del 1000 al 0: " + numeros);
    }
}
