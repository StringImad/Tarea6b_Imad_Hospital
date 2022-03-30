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

    public Administrativo() {
        super();
        this.grupo = Grupo.enumAleatorio();
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nifPersona) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nifPersona);
        this.grupo = grupo;
    }

    public void registrarDocumento(String nombreDoc) {
        System.out.println("El admin: " + this.nombre + " con apellido: " + this.apellido + " ha registrado el documento: " + nombreDoc + " con el hash" + nombreDoc.hashCode());
    }

    @Override
    public double calcularIRPF() {

        return this.salario * grupo.getIRPF();
    }

    @Override
    public String toString() {
        return super.toString() + "Administrativo{" + "grupo=" + grupo + '}';
    }

}
