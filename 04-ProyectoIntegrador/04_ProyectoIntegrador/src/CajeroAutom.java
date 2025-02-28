import javax.swing.*;

public class CajeroAutom {
    public static void main(String[] args) {
        double saldo = 1000.0;
        int opcion;

        do {
            String[] opciones = {
                    "Consultar saldo",
                    "Retirar dinero",
                    "Realizar transferencia",
                    "Salir"
            };

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Cajero Automático",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, String.format("Su saldo actual es: $%.2f", saldo));
                    break;

                case 1:
                    String retiroStr = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                    double retiro = Double.parseDouble(retiroStr);

                    if (retiro > saldo) {
                        JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                    } else if (retiro <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
                    } else {
                        saldo -= retiro;
                        JOptionPane.showMessageDialog(null, String.format("Ha retirado $%.2f\nSu saldo actual es: $%.2f", retiro, saldo));
                    }
                    break;

                case 2:
                    String cuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta de destino:");
                    String transferenciaStr = JOptionPane.showInputDialog("Ingrese la cantidad a transferir:");
                    double transferencia = Double.parseDouble(transferenciaStr);

                    if (transferencia > saldo) {
                        JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                    } else if (transferencia <= 0) {
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
                    } else {
                        saldo -= transferencia;
                        JOptionPane.showMessageDialog(null, String.format("Ha transferido $%.2f a la cuenta %s\nSu saldo actual es: $%.2f", transferencia, cuenta, saldo));
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el cajero automático.");
                    break;
            }
        } while (opcion != 3 && opcion != -1);
    }
}

