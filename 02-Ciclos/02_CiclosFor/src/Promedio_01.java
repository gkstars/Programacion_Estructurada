import javax.swing.*;

public class Promedio_01 {
    public static void main(String[] args) {
        int calif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));
        double suma = 0;
        for (int i = 0; i < calif; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + (i + 1) + ":"));
            suma += calificacion;
        }
        double promedio = suma / calif;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
}

