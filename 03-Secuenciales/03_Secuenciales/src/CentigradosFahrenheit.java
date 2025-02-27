import javax.swing.JOptionPane;

public class CentigradosFahrenheit {
    public static void main(String[] args) {
        //declaracion de variables
        double centigrados = 0.0;
        double fahrenheit = 0.0;

        //solicitar al usuario los grados centigrados
        centigrados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados centigrados para convertirlos a Fahrenheit:"));

        //calcular los grados Fahrenheit
        fahrenheit = (9.0 / 5.0) * centigrados + 32.0;

        //imprimir el resultado
        JOptionPane.showMessageDialog(null,
                centigrados + " grados centigrados son " + String.format("%.2f", fahrenheit) + " grados Fahrenheit");
    }
}
