package ar.davidbarre.ejemplo;

import ar.davidbarre.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("David","Barreneche",15,"Instituto nacional");
        alumno.setNotaCastellano(8);
        alumno.setNotaFisica(9);
        alumno.setNotaMatematica(8.6);


        AlumnoInternacional alumnoInt = new AlumnoInternacional("Jake","Paul","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Nacional");
        alumnoInt.setNotaIdiomas(9);
        alumnoInt.setNotaCastellano(10);
        alumnoInt.setNotaFisica(8.5);
        alumnoInt.setNotaMatematica(7.0);


        Profesor profesor = new Profesor("Juan","Vidal","Matematicas");
        profesor.setEdad(31);

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }
    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo datos del tipo persona");
        System.out.println("Nombre "+persona.getNombre()
                + " " + persona.getApellido()
                + ",edad " +  persona.getEdad()
                + ", email: "+persona.getEdad());
       if (persona instanceof Alumno) {
           System.out.println("Imprimiendo los datos del tipo alumno");
           System.out.println("Institucion " + ((Alumno) persona).getColegio());
           System.out.println("Nota matematica: " + ((Alumno) persona).getNotaMatematica());
           System.out.println("Nota castellano: " + ((Alumno) persona).getNotaCastellano());
           System.out.println("Nota fisica: " + ((Alumno) persona).getNotaFisica());
           if (persona instanceof AlumnoInternacional) {
               System.out.println("Imprimiendo los datos del tipo alumnointernacional");
               System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
               System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
           }
           System.out.println("======================== SOBRR ESCRITURA SALUDAR ========================");
           System.out.println(((Alumno) persona).calcularPromedio());
           System.out.println("========================");
       }
       if (persona instanceof Profesor){
           System.out.println("Imprimiendo los datos del tipo profesor");
           System.out.println("Materia: " + ((Profesor) persona).getAsignatura());
       }
        System.out.println("======================== SOBRR ESCRITURA SALUDAR ========================");
        System.out.println(persona.saludar());
        System.out.println("========================");
    }
}
