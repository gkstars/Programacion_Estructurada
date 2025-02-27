import javax.swing.*;

public class CalificacionMyB_02 {
    public static void main(String[] args) {
        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        double suma = 0;
        double calificacionMinima = 100;
        for (int i = 0; i < alumnos; i++) {
            double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i + 1) + ":"));
            suma += calificacion;
            if (calificacion < calificacionMinima) {
                calificacionMinima = calificacion;
            }
        }
        double promedio = suma / alumnos;
        JOptionPane.showMessageDialog(null,
                "El promedio es: " + promedio + "\nLa calificación más baja es: " + calificacionMinima);
    }
}
