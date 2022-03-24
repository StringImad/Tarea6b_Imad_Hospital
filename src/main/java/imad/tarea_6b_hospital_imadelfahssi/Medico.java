/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

/**
 *
 * @author imad
 */
public class Medico extends Empleado {

    private String especialidad;

    public void tratar(Paciente paciente, String medicina) {
        System.out.println("Médico " + this.nombre + " trata al paciente "
                + paciente.nombre + " con el medicamento " + medicina);
    }

    @Override
    public double calcularIRPF() {
        if (especialidad.equalsIgnoreCase("cirugia")) {
            return this.salario * 0.25;
        } else {
            return this.salario * 0.235;
        }
    }

}
