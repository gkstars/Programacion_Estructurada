import javax.swing.*;

public class Fruteria_05 {
    public static void main(String[] args) {
        double kilos = 0.0;
        double precio = 0.0;
        double precio2 = 0.0;
        double desc = 0.0;
        double descTotal = 0.0;
        double total = 0.0;

        kilos = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de kilos que vas a comprar: "));

        if (kilos >= 0.0 && kilos <= 2.0){
            precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio: "));
            total = precio * kilos;
            JOptionPane.showMessageDialog(null, "No se le realizó ningún descuento, su total es de; $" + total);
        } else if (kilos > 2.0 && kilos <= 5.0) {
            precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio: "));
            total = precio * kilos;
            desc = total * 0.10;
            descTotal = total - desc;
            JOptionPane.showMessageDialog(null, "Se te ha realizado un descuento del 10%, tu total es de: $" + descTotal);
        } else if (kilos > 5.0 && kilos <= 10.0) {
            precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio: "));
            total = precio * kilos;
            desc = total * 0.15;
            descTotal = total - desc;
            JOptionPane.showMessageDialog(null, "Se te ha realizado un descuento del 15%, tu total es de: $" + descTotal);
        } else if (kilos > 10.0) {
            precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio: "));
            total = precio * kilos;
            desc = total * 0.20;
            descTotal = total - desc;
            JOptionPane.showMessageDialog(null, "Se te ha realizado un descuento del 20%, tu total es de: $" + descTotal);
        }
    }
}
