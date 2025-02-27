import javax.swing.*;

public class Laboratorio_07 {
    public static void main(String[] args) {
        String menu = " ";
        String opcion = " ";

        menu = "Menu principal\n" + "1) Edad en meses\n" +
                "2) Edad en años\n" + "\nElegir opcion";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1":
                double hemoglobina = 0;
                int edadMeses = 0;
                edadMeses = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del paciente (en meses): "));

                if (edadMeses >= 0 && edadMeses <= 1) {
                    hemoglobina = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                    if (hemoglobina >= 13 && hemoglobina <= 26) {
                        JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                    }
                } else if (edadMeses > 1 && edadMeses <= 6) {
                    hemoglobina = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                    if (hemoglobina >= 10 && hemoglobina <= 18) {
                        JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                    }
                } else if (edadMeses > 6 && edadMeses <= 12) {
                    hemoglobina = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                    if (hemoglobina >= 11 && hemoglobina <= 15) {
                        JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                    }
                } else if (edadMeses > 12) {
                    JOptionPane.showMessageDialog(null, "El paciente cuenta con una edad en años, vuelva al menú.");
                }
                break;
            case "2":
                int edadYears = 0;
                double hemoglobina1 = 0;
                String sexo = " ";

                edadYears = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del paciente (en años): "));

                if (edadYears > 1 && edadYears <= 5){
                    hemoglobina1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                    if (hemoglobina1 >= 11.5 && hemoglobina1 <= 15) {
                        JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                    }
                } else if ( edadYears > 5 && edadYears <= 10) {
                    hemoglobina1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                    if (hemoglobina1 >= 12.6 && hemoglobina1 <= 15.5) {
                        JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                    }
                } else if (edadYears > 10 && edadYears <= 15) {
                    hemoglobina1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                    if (hemoglobina1 >= 13 && hemoglobina1 <= 15.5) {
                        JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                    }
                } else if (edadYears > 15){
                    sexo = JOptionPane.showInputDialog("Sexo del paciente M/F: ");
                    if (sexo.equalsIgnoreCase("F")){
                        hemoglobina1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                        if (hemoglobina1 >= 12 && hemoglobina1 <= 16) {
                            JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                        }
                    } else if (sexo.equalsIgnoreCase("M")) {
                        hemoglobina1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina del paciente: "));
                        if (hemoglobina1 >= 14 && hemoglobina1 <= 18) {
                            JOptionPane.showMessageDialog(null, "Negativo, el paciente no padece de anemia.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Positivo, el paciente padece de anemia");
                        }
                        break;
                    }

                }

        }
    }

}

