package org.ejercicios.ejercicio3tema3;

public class Estudiante extends Persona {

    private String numeroEstudiante;
    private String notaMedia;

    public Estudiante(){

    }

    public Estudiante(String numeroEstudiante){
        this.numeroEstudiante=numeroEstudiante;
    }
    public Estudiante(String nombre, String numeroEstudiante){
        super(nombre);
        this.numeroEstudiante=numeroEstudiante;
    }


}
