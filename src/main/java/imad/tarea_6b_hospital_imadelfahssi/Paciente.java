/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

/**
 *
 * @author imad
 */
public class Paciente extends Persona{
    private String numeroHistoria;
    
    public void tomarMedicina(String medicina){
        System.out.println("El paciente: "+this.nombre+" se ha tomnado: "+medicina);
    }
}
