import javax.swing.*;

public class PromedioW_05 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int i = 0;
        double suma = 0;
        while (i < n) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            i++;
        }
        double promedio = suma / n;
        JOptionPane.showMessageDialog(null, "El promedio de calificaciones es " + promedio);
    }
}
