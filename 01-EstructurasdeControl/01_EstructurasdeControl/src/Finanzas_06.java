import javax.swing.*;

public class Finanzas_06 {
    public static void main(String[] args) {
        //Declaracion de variables
        double capital, prestamo = 0, nuevoSaldo, insumos, incentivos;

        //Ingreso de datos
        capital = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital actual de la empresa"));

        //Calculo del nuevo saldo
        if (capital < 0) {
            prestamo = 10000 - capital;
            nuevoSaldo = 10000;
        } else if (capital >= 0 && capital <= 20000) {
            prestamo = 20000 - capital;
            nuevoSaldo = 20000;
        } else {
            nuevoSaldo = capital;
        }

        //Distribucion del presupuesto
        double restante = nuevoSaldo - 7000; // 5000 para equipo de computo y 2000 para mobiliario
        insumos = restante / 2;
        incentivos = restante / 2;

        //Mostrar resultado
        String mensaje = "Distribucion del presupuesto:\n" +
                "Equipo de computo: $5000\n" +
                "Mobiliario: $2000\n" +
                "Compra de insumos: $" + insumos + "\n" +
                "Incentivos al personal: $" + incentivos;
        if (prestamo > 0) {
            mensaje += "\nCantidad pedida al banco: $" + prestamo;
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

