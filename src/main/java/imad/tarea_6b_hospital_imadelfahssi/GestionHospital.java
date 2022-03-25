/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class GestionHospital {

    public static void main(String[] args) {

        Hospital nuevo = new Hospital();
        System.out.println("----------------------------------" + nuevo.getNombre());
        nuevo.contratarEmpleado(crearMedico());
        nuevo.contratarEmpleado(crearMedico());
        nuevo.contratarEmpleado(crearAdministrativo());
        nuevo.contratarEmpleado(crearAdministrativo());
        nuevo.contratarEmpleado(crearAdministrativo());

        nuevo.ingresarPaciente(crearPaciente());
        nuevo.ingresarPaciente(crearPaciente());
        nuevo.ingresarPaciente(crearPaciente());
        nuevo.ingresarPaciente(crearPaciente());
        nuevo.ingresarPaciente(crearPaciente());
        int contadorDocumento = 0;
        Medico aux = (Medico) (nuevo.getListaEmpleados().get(Utilidades.generadorNumeroAleatorioEntreDosRangos(0, 1)));
        aux.tratar(nuevo.getListaPacientes().get(Utilidades.generadorNumeroAleatorioEntreDosRangos(0, 4)), "Paracetamol");
        System.out.println(nuevo.toString());


        for (Empleado t : nuevo.getListaEmpleados()) {
            if (t instanceof Medico) {

                Medico auxi = (Medico) t;//Conversion explicita
                System.out.println(auxi.calcularIRPF());
            }

            if (t instanceof Administrativo) {
                contadorDocumento++;
                ((Administrativo) t).registrarDocumento("Documento" + contadorDocumento);
            }

        }
        //System.out.println(nuevo.toString());
    }

    public static Paciente crearPaciente() {

        Paciente nuevo = new Paciente();
        return nuevo;
    }

    public static Medico crearMedico() {
        Medico nuevo = new Medico();
        return nuevo;
    }

    public static Administrativo crearAdministrativo() {
        Administrativo nuevo = new Administrativo();
        return nuevo;
    }
}
