import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación:"));
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        double porcentajeAprobados = (aprobados * 100.0) / n;
        double porcentajeReprobados = (reprobados * 100.0) / n;
        JOptionPane.showMessageDialog(null, "Porcentaje de aprobados: " + porcentajeAprobados + "%\nPorcentaje de reprobados: " + porcentajeReprobados + "%");
    }
}
