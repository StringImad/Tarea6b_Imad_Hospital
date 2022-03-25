/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.util.Random;

/**
 *
 * @author imad
 */
public enum Grupo {
    C(0.175),
    D(0.18),
    E(0.185);
   private double IRPF;

    private Grupo(double IRPF) {
        this.IRPF = IRPF;
    }

    public double getIRPF() {
        return IRPF;
    }

    public static Grupo enumAleatorio() {
        int numeroAleatorio = new Random().nextInt(Grupo.values().length);
        return Grupo.values()[numeroAleatorio];
    }
    
    
}
