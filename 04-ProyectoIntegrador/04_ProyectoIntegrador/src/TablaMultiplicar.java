import javax.swing.*;

public class TablaMultiplicar {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Ingrese el número para ver su tabla de multiplicar:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder tabla = new StringBuilder("Tabla de multiplicar del " + numero + ":\n");

        for (int i = 1; i <= 10; i++) {
            tabla.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabla.toString());
    }
}