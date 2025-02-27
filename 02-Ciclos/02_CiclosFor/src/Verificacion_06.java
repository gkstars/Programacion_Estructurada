import javax.swing.*;

public class Verificacion_06 {
    public static void main(String[] args) {
        double suma = 0;
        double minContaminacion = 100;
        double maxContaminacion = 0;

        for (int i = 1; i <= 25; i++) {
            double puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de contaminantes del automóvil " + i + ":"));
            suma += puntos;
            if (puntos < minContaminacion) {
                minContaminacion = puntos;
            }
            if (puntos > maxContaminacion) {
                maxContaminacion = puntos;
            }
        }

        double promedio = suma / 25;
        JOptionPane.showMessageDialog(null,
                "Promedio de puntos de contaminantes: " + promedio + "\nMenor contaminación: "
                        + minContaminacion + "\nMayor contaminación: " + maxContaminacion);
    }
}
