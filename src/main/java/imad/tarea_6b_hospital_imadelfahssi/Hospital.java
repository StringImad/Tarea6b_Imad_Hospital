/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class Hospital {
    private String nombre;
    private String direccion;
    private int numeroCamas;
   private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Paciente> listaPacientes;
    
    public void contratarEmpleado(Empleado emp){
        listaEmpleados.add(emp);
    }
    
    public void ingresarPaciente(Paciente paciente){
        listaPacientes.add(paciente);
    }
}
