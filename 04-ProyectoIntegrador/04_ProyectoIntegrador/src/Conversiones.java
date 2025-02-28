import javax.swing.*;

public class Conversiones {
    public static void main(String[] args) {
        int opcion;

        do {
            String[] opciones = {
                    "Centímetros a Pulgadas",
                    "Kilogramos a Libras",
                    "Pies a Yardas",
                    "Salir"
            };

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione la conversión que desea realizar:",
                    "Convertidor de Unidades",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (opcion == 3 || opcion == -1) break;
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
            double cantidad = Double.parseDouble(cantidadStr);
            double resultado = 0;
            String unidadOrigen = "";
            String unidadDestino = "";

            switch (opcion) {
                case 0: // Centímetros a Pulgadas
                    resultado = cantidad / 2.54;
                    unidadOrigen = "centímetros";
                    unidadDestino = "pulgadas";
                    break;
                case 1: // Kilogramos a Libras
                    resultado = cantidad * 2.20462;
                    unidadOrigen = "kilogramos";
                    unidadDestino = "libras";
                    break;
                case 2: // Pies a Yardas
                    resultado = cantidad / 3;
                    unidadOrigen = "pies";
                    unidadDestino = "yardas";
                    break;
            }
            String mensaje = String.format("%.2f %s son %.2f %s",
                    cantidad, unidadOrigen, resultado, unidadDestino);
            JOptionPane.showMessageDialog(null, mensaje);

        } while (true);
        JOptionPane.showMessageDialog(null, "¡Gracias por usar el convertidor de unidades!");
    }
}

