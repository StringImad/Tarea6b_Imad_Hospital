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

    public Hospital() {
        nombre ="Costa del Sol";
        direccion ="Marbella";
        numeroCamas = 200;
        listaEmpleados = new ArrayList<>();
        listaPacientes = new ArrayList<>();
    }

    public Hospital(String nombre, String direccion, int numeroCamas, ArrayList<Empleado> listaEmpleados, ArrayList<Paciente> listaPacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpleados = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado emp) {
        listaEmpleados.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas + "\n, listaEmpleados=" + listaEmpleados + "\n, listaPacientes=" + listaPacientes + '}';
    }
    
}
