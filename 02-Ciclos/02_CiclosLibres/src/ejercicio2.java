import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de gallinas:"));
        double sumaCalidad = 0;
        for (int i = 0; i < n; i++) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina:"));
            int huevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de huevos:"));
            double calidad = (peso * altura) / huevos;
            sumaCalidad += calidad;
        }
        double promedioCalidad = sumaCalidad / n;
        double precio;
        if (promedioCalidad >= 15) {
            precio = 1.2 * promedioCalidad;
        } else if (promedioCalidad > 8) {
            precio = 1.0 * promedioCalidad;
        } else {
            precio = 0.8 * promedioCalidad;
        }
        JOptionPane.showMessageDialog(null, "El precio por kilo de huevo es: " + precio);
    }
}

