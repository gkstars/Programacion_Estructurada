import javax.swing.*;

public class Computadoras_01 {
    public static void main(String[] args) {
        int numComputadoras = 0;
        double desc5 = 0.0;
        double precioTotal = 0.0;
        double total = 0.0;

        numComputadoras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de computadoras: "));

        if(numComputadoras<5){
            desc5 = numComputadoras * 11000.0;
            precioTotal = desc5 * 0.10;
            total = desc5 - precioTotal;
            JOptionPane.showMessageDialog(null, "Se te ha aplicado el 10% de descuento, por lo tanto tu total es de: $" + total);
        } else if (numComputadoras>=5 && numComputadoras<10) {
            desc5 = numComputadoras * 11000.0;
            precioTotal = desc5 * 0.20;
            total = desc5 - precioTotal;
            JOptionPane.showMessageDialog(null, "Se te ha aplicado el 20% de descuento, por lo tanto tu total es de: $" + total);
        } else if (numComputadoras>=10) {
            desc5 = numComputadoras * 11000.0;
            precioTotal = desc5 * 0.40;
            total = desc5 - precioTotal;
            JOptionPane.showMessageDialog(null, "Se te ha aplicado el 40% de descuento, por lo tanto tu total es de: $" + total);
        }
    }
}