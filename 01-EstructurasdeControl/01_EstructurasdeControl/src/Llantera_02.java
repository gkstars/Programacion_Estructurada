import javax.swing.*;

public class Llantera_02 {
    public static void main(String[] args) {
        int numLlantas = 0;
        double total = 0.0;

        numLlantas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de llantas que vas a comprar: "));

        if (numLlantas<5){
            total = numLlantas * 300;
            JOptionPane.showMessageDialog(null,"El precio por cada llanta es de $300, por lo tanto deberá pagar: $" + total);
        } else if (numLlantas>=5 && numLlantas<=10) {
            total = numLlantas * 250;
            JOptionPane.showMessageDialog(null,"El precio por cada llanta es de $250, por lo tanto deberá pagar: $" + total);
        } else if (numLlantas>10) {
            total= numLlantas * 200;
            JOptionPane.showMessageDialog(null,"El precio por cada llanta es de $200, por lo tanto deberá pagar: $" + total);
        }
    }
}
