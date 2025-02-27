import javax.swing.*;

public class Naranjas_05 {
    public static void main(String[] args) {
        double precioPorKilo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por kilo de naranjas:"));
        double totalTienda = 0;

        for (int i = 1; i <= 15; i++) {
            double kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilos de naranjas del cliente " + i + ":"));
            double totalCliente = kilos * precioPorKilo;
            if (kilos > 10) {
                totalCliente *= 0.85;
            }
            totalTienda += totalCliente;
            JOptionPane.showMessageDialog(null, "El cliente " + i + " debe pagar: " + totalCliente);
        }

        JOptionPane.showMessageDialog(null, "La tienda percibirá un total de: " + totalTienda);
    }

}
