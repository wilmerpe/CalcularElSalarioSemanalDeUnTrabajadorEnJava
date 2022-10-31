import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int horasTrabajadas , salarioSemanal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas ha trabajado esta semana? "));

        if(horasTrabajadas > 40){
        salarioSemanal = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }else{
        salarioSemanal = horasTrabajadas * 16;
        }

        JOptionPane.showMessageDialog(null, "El salario semanal de el trabajador es: " + salarioSemanal);
    }
}
