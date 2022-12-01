package org.ejercicios.ejercicio3tema3;

public class Persona {

    private String nombre;
    private String telefono;
    private String correo;

    private Direccion direccion;

    public Persona(){

    }

    public Persona (String nombre){
        this.nombre = nombre;
    }

    public void saludo () {
        System.out.println("Hola, me llamo " + nombre + " y soy de " + direccion);

    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono (String telefono){
        this.telefono=telefono;
    }

    public String getCorreo(){
        return correo;
    }
    public void setCorreo (String correo){
        this.correo=correo;
    }


}
