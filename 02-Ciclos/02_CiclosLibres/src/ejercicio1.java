import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos:"));
        double sumaMasa = 0;
        for (int i = 0; i < n; i++) {
            double presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presión:"));
            double volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen:"));
            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura:"));
            double masa = (presion * volumen) / (0.37 * (temperatura + 460));
            sumaMasa += masa;
        }
        double promedioMasa = sumaMasa / n;
        JOptionPane.showMessageDialog(null, "El promedio de masa es: " + promedioMasa);
    }
}
