import javax.swing.JOptionPane;

public class SueldoEmpleado {
    public static void main(String[] args) {
        // Variables
        String nombreEmpleado;
        int horasTrabajadas;
        double sueldo;

        //constantes
        final double cuotaPorHora = 150.0;

        // Asignación de valores
        nombreEmpleado = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas"));

        // Cálculo del sueldo
        sueldo = horasTrabajadas * cuotaPorHora;

        // Impresión de resultados
        JOptionPane.showMessageDialog(null,
                "El empleado " + nombreEmpleado + " va a percibir un sueldo de $" + String.format("%.2f", sueldo));
    }
}
