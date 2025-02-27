import javax.swing.*;

public class Bolitas_01 {
    public static void main(String[] args) {
        double totalCompra = 0;
        double descuento = 0;
        boolean continuar = true;

        do {
            String[] opciones = {"Roja", "Amarilla", "Blanca"};
            int seleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione el color de la bolita",
                    "Descuento", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la compra:"));

            switch (seleccion) {
                case 0:
                    descuento = 0.40;
                    break;
                case 1:
                    descuento = 0.25;
                    break;
                case 2:
                    descuento = 0.0;
                    break;
            }

            totalCompra = precio - (precio * descuento);
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalCompra);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra compra?",
                    "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
            }
        } while (continuar);
    }
}
