import javax.swing.*;

public class Seguros_01 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        int i = 0;
        while (i < n) {
            double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor " + (i + 1) + ":"));
            double venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la primera venta:"));
            double venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la segunda venta:"));
            double venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la tercera venta:"));
            double comision = (venta1 + venta2 + venta3) * 0.10;
            double sueldoTotal = sueldoBase + comision;
            JOptionPane.showMessageDialog(null, "El vendedor " + (i + 1) + " obtendrá $" + comision + " por comisiones y $" + sueldoTotal + " en total.");
            i++;
        }
    }
}
