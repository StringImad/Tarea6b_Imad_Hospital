/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package imad.tarea_6b_hospital_imadelfahssi;

import java.time.LocalDate;

/**
 *
 * @author imad
 */
public class Nif {

    private String numeroDNI;
    private char letraDNI;
    private LocalDate fechaCaducidad;

    public Nif(String numeroDNI, LocalDate fechaCaducidad) {
        if (numeroDNI.length() > 8 || numeroDNI.length() < 8) {
            numeroDNI = "12345678";
        }
        this.numeroDNI = numeroDNI;
        this.letraDNI = (char) generadorLetraDni();
        this.fechaCaducidad = fechaCaducidad;

    }

    public Nif() {
        this.numeroDNI = "12131312";
        this.letraDNI = 'b';
        this.fechaCaducidad = LocalDate.now();
    }
//método renovarNif lo que hace es cambiar la fecha de caducidad del NIF de la persona, sabiendo que tiene 10 años de validez desde la fecha de la solicitud de renovación. 

    public void renovarDni(LocalDate fechaSolicitudRenovacion) {
        this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }

    private char generadorLetraDni() {
        int letraGenerada;
        String palabra = "TRWAGMYFPDXBNJZSQVHLCKE";
        // char letra = 0;
        letraGenerada = (Integer.parseInt(getNumeroDNI()) % 23);

        return palabra.charAt(letraGenerada);
    }

    public String getNumeroDNI() {
        return numeroDNI;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    @Override
    public String toString() {
        return "NIF{" + numeroDNI + "-" + letraDNI + '}';
    }

}
