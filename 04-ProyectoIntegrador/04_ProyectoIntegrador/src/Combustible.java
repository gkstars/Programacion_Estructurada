import javax.swing.*;

public class Combustible {
    public static void main(String[] args) {
        final double PRECIO_DIESEL = 31.0;
        final double PRECIO_MAGNA = 24.0;
        final double PRECIO_PREMIUM = 28.0;
        double totalRecaudado = 0;
        double totalDiesel = 0;
        double totalMagna = 0;
        double totalPremium = 0;

        int opcion;

        do {
            // Selección del tipo de combustible
            String[] opciones = {"Diesel", "Magna", "Premium"};
            opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione el tipo de combustible:",
                    "Venta de Combustible",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcion == -1) break;

            String litrosStr = JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos:");
            double litros = Double.parseDouble(litrosStr);
            double totalCliente = 0;

            switch (opcion) {
                case 0: // Diesel
                    totalCliente = litros * PRECIO_DIESEL;
                    totalDiesel += litros;
                    break;
                case 1: // Magna
                    totalCliente = litros * PRECIO_MAGNA;
                    totalMagna += litros;
                    break;
                case 2: // Premium
                    totalCliente = litros * PRECIO_PREMIUM;
                    totalPremium += litros;
                    break;
            }

            totalRecaudado += totalCliente;
            JOptionPane.showMessageDialog(null, String.format("Total a pagar por el cliente: $%.2f", totalCliente));

        } while (JOptionPane.showConfirmDialog(null, "¿Hay otro cliente?", "Confirmar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        String masVendido;
        String menosVendido;

        if (totalDiesel >= totalMagna && totalDiesel >= totalPremium) {
            masVendido = "Diesel";
        } else if (totalMagna >= totalDiesel && totalMagna >= totalPremium) {
            masVendido = "Magna";
        } else {
            masVendido = "Premium";
        }

        if (totalDiesel <= totalMagna && totalDiesel <= totalPremium) {
            menosVendido = "Diesel";
        } else if (totalMagna <= totalDiesel && totalMagna <= totalPremium) {
            menosVendido = "Magna";
        } else {
            menosVendido = "Premium";
        }

        String resumen = String.format(
                "Total recaudado en el día: $%.2f\n" +
                        "Litros vendidos:\n" +
                        " - Diesel: %.2f litros\n" +
                        " - Magna: %.2f litros\n" +
                        " - Premium: %.2f litros\n" +
                        "Combustible más vendido: %s\n" +
                        "Combustible menos vendido: %s",
                totalRecaudado, totalDiesel, totalMagna, totalPremium, masVendido, menosVendido);

        JOptionPane.showMessageDialog(null, resumen);
    }
}

