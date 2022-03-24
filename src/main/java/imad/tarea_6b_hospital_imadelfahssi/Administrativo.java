/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

/**
 *
 * @author imad
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public void registrarDocumento(String nombreDoc) {

    }

    @Override
    public double calcularIRPF() {
        switch(grupo.name()){
            case "C":
                return this.salario*(0.175);
            case "D":
                return this.salario*(0.18);
            case "E":
                return this.salario*(0.185);
        }
        return 0;
        }

}
