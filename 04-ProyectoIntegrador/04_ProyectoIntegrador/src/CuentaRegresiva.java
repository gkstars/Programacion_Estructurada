import javax.swing.*;

public class CuentaRegresiva {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog("Ingrese un número para la cuenta regresiva:");
        int numero = Integer.parseInt(numeroStr);
        StringBuilder cuenta = new StringBuilder("Cuenta regresiva:\n");

        for (int i = numero; i >= 0; i--) {
            cuenta.append(i).append("\n");
        }
        JOptionPane.showMessageDialog(null, cuenta.toString());
    }
}
