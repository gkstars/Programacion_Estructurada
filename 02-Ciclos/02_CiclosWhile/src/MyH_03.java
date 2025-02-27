import javax.swing.*;

public class MyH_03 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));
        int i = 0;
        int hombres = 0;
        int mujeres = 0;
        while (i < n) {
            String genero = JOptionPane.showInputDialog("Ingrese el género de la persona " + (i + 1) + " (M/F):");
            if (genero.equalsIgnoreCase("M")) {
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                mujeres++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Hay " + hombres + " hombres y " + mujeres + " mujeres.");
    }
}
