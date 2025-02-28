import javax.swing.*;

public class Numeros {
    public static void main(String[] args) {
        int sumaPares = 0;
        int productoImpares = 1;
        int cantidadNegativos = 0;
        boolean hayImpares = false;

        int opcion;

        do {
            String numeroStr = JOptionPane.showInputDialog("Ingrese un número:");
            int numero = Integer.parseInt(numeroStr);

            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                productoImpares *= numero;
                hayImpares = true;
            }

            if (numero < 0) {
                cantidadNegativos++;
            }

            opcion = JOptionPane.showConfirmDialog
                    (null, "¿Desea ingresar otro número?", "Continuar",
                            JOptionPane.YES_NO_OPTION);

        } while (opcion == JOptionPane.YES_OPTION);

        if (!hayImpares) {
            productoImpares = 0;
        }
        String resultado = String.format(
                "Suma de los números pares: %d\n" +
                        "Producto de los números impares: %d\n" +
                        "Cantidad de números negativos: %d",
                sumaPares, productoImpares, cantidadNegativos);

        JOptionPane.showMessageDialog(null, resultado);
    }
}

