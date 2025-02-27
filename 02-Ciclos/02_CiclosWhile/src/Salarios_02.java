import javax.swing.*;

public class Salarios_02 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de obreros:"));
        int i = 0;
        while (i < n) {
            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el obrero " + (i + 1) + ":"));
            double salario;
            if (horasTrabajadas <= 40) {
                salario = horasTrabajadas * 20;
            } else {
                salario = 40 * 20 + (horasTrabajadas - 40) * 25;
            }
            JOptionPane.showMessageDialog(null, "El salario del obrero " + (i + 1) + " es $" + salario);
            i++;
        }
    }
}
