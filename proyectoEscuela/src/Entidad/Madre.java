/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Madre {

    String APELLIDO_MADRE1;
    String APELLIDO_MADRE2;
    String CORREO_MADRE;
    String NOMBRE_MADRE;
    String TELEFONO_CONTACTO;
    int ID_MADRE;
    int ID_PROVINCIA;

    public Madre() {
    }

    public Madre(String APELLIDO_MADRE1, String APELLIDO_MADRE2, String CORREO_MADRE, String NOMBRE_MADRE, String TELEFONO_CONTACTO, int ID_MADRE, int ID_PROVINCIA) {
        this.APELLIDO_MADRE1 = APELLIDO_MADRE1;
        this.APELLIDO_MADRE2 = APELLIDO_MADRE2;
        this.CORREO_MADRE = CORREO_MADRE;
        this.NOMBRE_MADRE = NOMBRE_MADRE;
        this.TELEFONO_CONTACTO = TELEFONO_CONTACTO;
        this.ID_MADRE = ID_MADRE;
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

    public String getAPELLIDO_MADRE1() {
        return APELLIDO_MADRE1;
    }

    public String getAPELLIDO_MADRE2() {
        return APELLIDO_MADRE2;
    }

    public String getCORREO_MADRE() {
        return CORREO_MADRE;
    }

    public String getNOMBRE_MADRE() {
        return NOMBRE_MADRE;
    }

    public String getTELEFONO_CONTACTO() {
        return TELEFONO_CONTACTO;
    }

    public int getID_MADRE() {
        return ID_MADRE;
    }

    public int getID_PROVINCIA() {
        return ID_PROVINCIA;
    }

    public void setAPELLIDO_MADRE1(String APELLIDO_MADRE1) {
        this.APELLIDO_MADRE1 = APELLIDO_MADRE1;
    }

    public void setAPELLIDO_MADRE2(String APELLIDO_MADRE2) {
        this.APELLIDO_MADRE2 = APELLIDO_MADRE2;
    }

    public void setCORREO_MADRE(String CORREO_MADRE) {
        this.CORREO_MADRE = CORREO_MADRE;
    }

    public void setNOMBRE_MADRE(String NOMBRE_MADRE) {
        this.NOMBRE_MADRE = NOMBRE_MADRE;
    }

    public void setTELEFONO_CONTACTO(String TELEFONO_CONTACTO) {
        this.TELEFONO_CONTACTO = TELEFONO_CONTACTO;
    }

    public void setID_MADRE(int ID_MADRE) {
        this.ID_MADRE = ID_MADRE;
    }

    public void setID_PROVINCIA(int ID_PROVINCIA) {
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

   

}
