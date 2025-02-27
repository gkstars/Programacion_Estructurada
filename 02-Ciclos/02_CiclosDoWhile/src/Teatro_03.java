import javax.swing.*;

public class Teatro_03 {
    public static void main(String[] args) {
        double totalDescuento = 0;
        boolean continuar = true;

        do {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
            double precioBoleto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del boleto:"));
            double descuento = 0;

            if (edad >= 5 && edad <= 14) {
                descuento = 0.35;
            } else if (edad >= 15 && edad <= 19) {
                descuento = 0.25;
            } else if (edad >= 20 && edad <= 45) {
                descuento = 0.10;
            } else if (edad >= 46 && edad <= 65) {
                descuento = 0.25;
            } else if (edad >= 66) {
                descuento = 0.35;
            } else {
                JOptionPane.showMessageDialog(null, "Los niños menores de 5 años no pueden ingresar al teatro.");
                continue;
            }

            totalDescuento += precioBoleto * descuento;

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro cliente?",
                    "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
            }
        } while (continuar);

        JOptionPane.showMessageDialog(null, "El total de dinero dejado de percibir por descuentos es: " + totalDescuento);
    }
}

