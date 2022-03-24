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
    public Nif(String numeroDNI) {
        if (numeroDNI.length() > 8 || numeroDNI.length() < 8) {
            numeroDNI = "12345678";
        }
        this.numeroDNI = numeroDNI;
        this.letraDNI = (char) generadorLetraDni();
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
