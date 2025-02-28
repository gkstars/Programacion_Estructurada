import javax.swing.*;

public class NumerosPrimos {
    public static void main(String[] args) {
        int contadorPrimos = 0;
        int numero = 2;
        StringBuilder primos = new StringBuilder("Los primeros 7 números primos son:\n");

        while (contadorPrimos < 7) {
            if (esPrimo(numero)) {
                primos.append(numero).append("\n");
                contadorPrimos++;
            }
            numero++;
        }

        JOptionPane.showMessageDialog(null, primos.toString());
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
