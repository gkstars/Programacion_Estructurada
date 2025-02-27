import javax.swing.*;

public class EdadPromedio_06 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));
        int i = 0;
        double sumaHombres = 0;
        double sumaMujeres = 0;
        int hombres = 0;
        int mujeres = 0;
        while (i < n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género del alumno " + (i + 1) + " (M/F):");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + (i + 1) + ":"));
            if (genero.equalsIgnoreCase("M")) {
                sumaHombres += edad;
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                sumaMujeres += edad;
                mujeres++;
            }
            i++;
        }
        double promedioHombres = sumaHombres / hombres;
        double promedioMujeres = sumaMujeres / mujeres;
        double promedioTotal = (sumaHombres + sumaMujeres) / n;
        JOptionPane.showMessageDialog(null, "Promedio de edades: Hombres: " + promedioHombres + ", Mujeres: " + promedioMujeres + ", Total: " + promedioTotal);
    }
}
