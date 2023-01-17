package ar.davidbarre.ejemplo;

import ar.davidbarre.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Persona alumno = new Alumno();
        alumno.setNombre("Pepe");
        alumno.setApellido("Gonzalez");
        ((Alumno)alumno).setColegio("Insituto nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Vidal");
        profesor.setAsignatura("Matematicas");


        System.out.println(alumno.getNombre()+" "+alumno.getApellido()+", " + ((Alumno) alumno).getColegio());
        System.out.println("Profesor "+profesor.getAsignatura()+": "+
                profesor.getNombre()+" "+profesor.getApellido());


    }
}
