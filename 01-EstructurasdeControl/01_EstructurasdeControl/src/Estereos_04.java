import javax.swing.*;

public class Estereos_04 {
    public static void main(String[] args) {
        double precio = 0.0;
        double iva = 0.0;
        double desc = 0.0;
        double desc1 = 0.0;
        double desc2 = 0.0;
        double desc3 = 0.0;
        double total1 = 0.0;
        double total2 = 0.0;
        double total3 = 0.0;
        int marca = 0;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de tu producto: "));
        marca = Integer.parseInt(JOptionPane.showInputDialog
                ("¿Tu producto es de la marca NOSY? \n1.Sí\n2.No\nEscoge el número de tu respuesta: "));

        if (marca == 1) {
            if (precio >= 2000) {
                desc = precio * 0.10;
                desc2 = precio * 0.05;
                desc1 = precio - desc;
                desc3 = desc1 - desc2;
                iva = desc3 * 0.16;
                total1 = iva + desc3;

                JOptionPane.showMessageDialog
                        (null, "Se te proporcionado un descuento del 10%, tu total es de: $"
                                + desc1 + " también cuentas con un descuento del 5% por comprar un producto de NOSY, tu cuenta es de: $"
                                + desc3 + " y con IVA incluido: $" + total1);
            } else {
                desc = precio * 0.10;
                desc1 = precio - desc;
                iva = desc1 * 0.16;
                total3 = iva + desc1;

                JOptionPane.showMessageDialog
                        (null, "Se te proporcionado un descuento del 10%, tu total es de: $"
                                + desc1 + " y con IVA incluido: $" + total3);
            }
            iva = precio * 0.16;
            total2 = iva + precio;
            JOptionPane.showMessageDialog
                    (null, "El total de tu compra con IVA incluido es de: $" + total2);
        }else{
            desc2 = precio * 0.05;
            desc1 = precio - desc2;
            iva = desc1 * 0.16;
            total1 = iva + desc1;

            JOptionPane.showMessageDialog
                    (null, "Se te ha proporcionado un descuento del 5%, tu cuenta: " + desc1 + "\n El total de tu compra con IVA incluido es de: $" + total1);
        }

    }
}

