import javax.swing.*;

public class Estudiantes_08 {
    public static void main(String[] args) {
        String menu = " ";
        String opcion = " ";

        menu = "Menu principal\n" + "1) El alumno cursa la preparatoria\n" +
                "2) El alumno cursa el profesional\n" + "\nElegir opcion";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1":
                double promedio = 0.0;
                double desc = 0.0, desc1 = 0.0, desc2 = 0.0;
                double unidades = 0.0;
                int materiasReprobadas = 0;

                promedio = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio: "));

                if (promedio >= 9.5) {
                    unidades = 55 / 5;
                    desc = unidades * 180;
                    desc1 = desc * 0.25;
                    desc2 = desc - desc1;

                    JOptionPane.showMessageDialog(null, "Felicidades, puedes cursar 55 unidades y obtendrás un descuento del 25% en tus colegiaturas \n" +
                            "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc2);
                } else if (promedio < 9.5 && promedio >= 9) {
                    unidades = 50 / 5;
                    desc = unidades * 180;
                    desc1 = desc * 0.10;
                    desc2 = desc - desc1;

                    JOptionPane.showMessageDialog(null, "Felicidades, puedes cursar 50 unidades y obtendrás un descuento del 10% en tus colegiaturas \n" +
                            "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc2);
                } else if (promedio < 9 && promedio > 7) {
                    unidades = 50 / 5;
                    desc = unidades * 180;

                    JOptionPane.showMessageDialog(null, "Puedes cursar 50 unidades, lamentablemente no hay descuento en tu colegiatura.\n" +
                            "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc);
                } else if (promedio <= 7) {
                    materiasReprobadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas materias reprobaste: "));
                    if (materiasReprobadas >= 0 && materiasReprobadas <= 3) {
                        unidades = 45 / 5;
                        desc = unidades * 180;

                        JOptionPane.showMessageDialog(null, "Puedes cursar 45 unidades, lamentablemente no hay descuento en tu colegiatura.\n" +
                                "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc);
                    } else if (materiasReprobadas >= 4) {
                        unidades = 40 / 5;
                        desc = unidades * 180;

                        JOptionPane.showMessageDialog(null, "Puedes cursar 40 unidades, lamentablemente no hay descuento en tu colegiatura.\n" +
                                "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc);
                    }

                }
                break;

            case "2":
                double promedio1 = 0.0;
                double desc3 = 0.0, desc4 = 0.0, desc5 = 0.0;
                double unidades1 = 0.0;
                int materiasReprobadas1 = 0;

                promedio1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio: "));

                if (promedio1 >= 9.5){
                    unidades = 55 / 5;
                    desc3 = unidades * 300;
                    desc4 = desc3 * 0.20;
                    desc5 = desc3 - desc4;

                    JOptionPane.showMessageDialog(null, "Felicidades, puedes cursar 55 unidades y obtendrás un descuento del 20% en tus colegiaturas \n" +
                            "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc5);
                } else if (promedio1 < 9.5) {
                    unidades = 55 / 5;
                    desc3 = unidades * 300;

                    JOptionPane.showMessageDialog(null, "Puedes cursar 55 unidades, lamentablemente no hay descuento en tu colegiatura. \n" +
                            "Ten en cuenta que para tu siguiente colegiatura deberás pagar: $" + desc3);
                }
                break;
        }
    }
}

