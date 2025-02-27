import javax.swing.*;

public class TabladeMultiplicar_03 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para la tabla de multiplicar:"));
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}