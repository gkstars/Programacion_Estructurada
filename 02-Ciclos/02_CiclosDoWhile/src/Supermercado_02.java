import javax.swing.*;

public class Supermercado_02 {
    public static void main(String[] args) {
        double totalCompra = 0;
        boolean continuar = true;

        do {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad adquirida:"));

            totalCompra += precio * cantidad;

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro artículo?",
                    "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != 0) {
                continuar = false;
            }
        } while (continuar);

        JOptionPane.showMessageDialog(null, "El total de la compra es: " + totalCompra);
    }
}
