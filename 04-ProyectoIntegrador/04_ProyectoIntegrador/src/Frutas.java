import javax.swing.*;

public class Frutas {
    public static void main(String[] args) {
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de fruta comprada (en kg):");
        double cantidad = Double.parseDouble(cantidadStr);

        String precioStr = JOptionPane.showInputDialog("Ingrese el precio por kg de la fruta:");
        double precioPorKg = Double.parseDouble(precioStr);

        double montoTotal = cantidad * precioPorKg;

        if (cantidad > 5) {
            double descuento = montoTotal * 0.15;
            montoTotal -= descuento;
            JOptionPane.showMessageDialog(null, "¡Aplica un descuento del 15%!");
        }

        JOptionPane.showMessageDialog(null, String.format("El monto a pagar es: %.2f", montoTotal));
    }
}
