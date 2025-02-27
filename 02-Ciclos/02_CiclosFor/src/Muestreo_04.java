import javax.swing.*;

public class Muestreo_04 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        double sumaNinos = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;
        int countNinos = 0, countJovenes = 0, countAdultos = 0, countViejos = 0;

        for (int i = 0; i < n; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + (i + 1) + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona " + (i + 1) + ":"));

            if (edad <= 12) {
                sumaNinos += peso;
                countNinos++;
            } else if (edad <= 29) {
                sumaJovenes += peso;
                countJovenes++;
            } else if (edad <= 59) {
                sumaAdultos += peso;
                countAdultos++;
            } else {
                sumaViejos += peso;
                countViejos++;
            }
        }

        double promedioNinos = countNinos == 0 ? 0 : sumaNinos / countNinos;
        double promedioJovenes = countJovenes == 0 ? 0 : sumaJovenes / countJovenes;
        double promedioAdultos = countAdultos == 0 ? 0 : sumaAdultos / countAdultos;
        double promedioViejos = countViejos == 0 ? 0 : sumaViejos / countViejos;

        JOptionPane.showMessageDialog(null, "Promedio de peso:\nNiños: " + promedioNinos + "\nJóvenes: " + promedioJovenes + "\nAdultos: " + promedioAdultos + "\nViejos: " + promedioViejos);
    }
}

