package ar.davidbarre.ejemplo;

import ar.davidbarre.pooherencia.Alumno;
import ar.davidbarre.pooherencia.AlumnoInternacional;
import ar.davidbarre.pooherencia.Persona;
import ar.davidbarre.pooherencia.Profesor;

public class EjemploHerenciatoString {
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
        System.out.println("========= - =========");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }
    public static void imprimir(Persona persona){
        System.out.println("========= - =========");
        System.out.println(persona);
    }
}
