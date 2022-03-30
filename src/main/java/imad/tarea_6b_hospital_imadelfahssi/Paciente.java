/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author imad
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente() {
        super();
        this.numeroHistoria = RandomStringUtils.randomNumeric(10);
    }

    public Paciente(String numeroHistoria, String nombre, String apellido, Nif nifPersona) {
        super(nombre, apellido, nifPersona);
        this.numeroHistoria = numeroHistoria;
    }

    public void tomarMedicina(String medicina) {
        Random aleatorio = new Random();
        if (aleatorio.nextBoolean()) {
            System.out.println("El paciente: " + this.nombre + " se ha tomnado: " + medicina + " se ha curado");
        } else {
            System.out.println("El paciente: " + this.nombre + " se ha tomnado: " + medicina + " no se ha curado");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Paciente{" + "numeroHistoria=" + numeroHistoria + '}';
    }

}
