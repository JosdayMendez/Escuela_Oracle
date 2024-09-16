/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import BO.AulaBO;
import BO.EstudianteBO;
import BO.HorarioBO;
import Entidad.Aula;
import Entidad.Estudiante;
import Entidad.Horario;

/**
 *
 * @author josda
 */
public class test {

    EstudianteBO ebo = new EstudianteBO();
    Estudiante es = new Estudiante();

    HorarioBO HObo = new HorarioBO();
    Horario HO = new Horario();
    
    AulaBO aBO = new AulaBO();
    Aula a = new Aula();
    String mensaje = "";

    public void insertar() {
        /*es.setNOMBRE("pepe");
        es.setAPELLIDO1("kl");
        es.setAPELLIDO2("erw");
        es.setID_PADRE(12);
        es.setID_MADRE(3);
        es.setID_PROVINCIA(3);

        mensaje = ebo.agregarEstudiante(es);
        System.out.println(mensaje); */

        /*HO.setID_HORARIO(2);
        HO.setHORA_INGRESO("9");
        HO.setHORA_SALIDA("7");

        mensaje = HObo.agregarHorario(HO);
        System.out.println(mensaje);
        */
        
        a.setID_AULA(2);
        a.setCAPACIDAD_AULA(22);
        a.setID_PABELLON(12);
        
        mensaje = aBO.agregarAula(a);
        System.out.println(mensaje);

    }

    public static void main(String[] args) {

        test test = new test();
        //test.insertar();
        //test.modificar();
        test.ELIMINAR();
    }

    public void modificar() {

        /* es.setNOMBRE("PEDRO");
        es.setAPELLIDO1("kl");
        es.setAPELLIDO2("erw");
        es.setID_PADRE(12);
        es.setID_MADRE(3);
        es.setID_PROVINCIA(3);

        mensaje = ebo.ModificarEstudiante(es);
        System.out.println(mensaje);

         */
        HO.setID_HORARIO(2);
        HO.setHORA_INGRESO("9:00:00 am");
        HO.setHORA_SALIDA("5:00:00 pm");
        mensaje = HObo.ModificarHorario(HO);
        System.out.println(mensaje);

    }

    public void ELIMINAR() {
       
        mensaje = HObo.eliminarHorario(2);
        System.out.println(mensaje);

    }

}
