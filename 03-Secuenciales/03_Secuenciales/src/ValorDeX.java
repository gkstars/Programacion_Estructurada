import javax.swing.JOptionPane;

public class ValorDeX {
    public static void main(String[] args) {
        // Declaracion de variables
        double x = 0, y = 0;

        // Pedimos el valor de x
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de x: "));
        y = 3 * Math.pow(x, 2) + 7 * x - 15;

        // Mostramos el valor de y
        JOptionPane.showMessageDialog(null,
                "El valor de y es: " + String.format("%.2f", y) + " cuando x es: " + x);



        //En caso de que se quiera calcular el valor de x

        /*
        //Declaracion de variables
        double x = 0, x2 = 0;
        double y = 0;

        // Pedimos el valor de y
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de y: "));

        // Calculamos el valor primer valor de x
        x = (-7 + Math.sqrt(Math.pow(7, 2) - 4 * 3 * -15)) / (2 * 3);

        // Calculamos el segundo valor de x
        x2 = (-7 - Math.sqrt(Math.pow(7, 2) - 4 * 3 * -15)) / (2 * 3);

        // Mostramos ambos valores de x
        JOptionPane.showMessageDialog(null,
        "Los valores de x son: " + String.format("%.2f", x) + " y " + String.format("%.2f", x2) +
        " cuando y es: " + y);
        */
    }
}
