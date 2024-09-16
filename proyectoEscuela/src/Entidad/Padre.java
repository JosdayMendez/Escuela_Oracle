/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author josda
 */
public class Padre {

    String APELLIDO_PADRE1;
    String APELLIDO_PADRE2;
    String CORREO_PADRE;
    String NOMBRE_PADRE;
    String TELEFONO_CONTACTO;
    int ID_PADRE;
    int ID_PROVINCIA;

    public Padre() {
    }

    public Padre(String APELLIDO_PADRE1, String APELLIDO_PADRE2, String CORREO_PADRE, String NOMBRE_PADRE, String TELEFONO_CONTACTO, int ID_PADRE, int ID_PROVINCIA) {
        this.APELLIDO_PADRE1 = APELLIDO_PADRE1;
        this.APELLIDO_PADRE2 = APELLIDO_PADRE2;
        this.CORREO_PADRE = CORREO_PADRE;
        this.NOMBRE_PADRE = NOMBRE_PADRE;
        this.TELEFONO_CONTACTO = TELEFONO_CONTACTO;
        this.ID_PADRE = ID_PADRE;
        this.ID_PROVINCIA = ID_PROVINCIA;
    }

    public String getAPELLIDO_PADRE1() {
        return APELLIDO_PADRE1;
    }

    public String getAPELLIDO_PADRE2() {
        return APELLIDO_PADRE2;
    }

    public String getCORREO_PADRE() {
        return CORREO_PADRE;
    }

    public String getNOMBRE_PADRE() {
        return NOMBRE_PADRE;
    }

    public String getTELEFONO_CONTACTO() {
        return TELEFONO_CONTACTO;
    }

    public int getID_PADRE() {
        return ID_PADRE;
    }

    public int getID_PROVINCIA() {
        return ID_PROVINCIA;
    }

    public void setAPELLIDO_PADRE1(String APELLIDO_PADRE1) {
        this.APELLIDO_PADRE1 = APELLIDO_PADRE1;
    }

    public void setAPELLIDO_PADRE2(String APELLIDO_PADRE2) {
        this.APELLIDO_PADRE2 = APELLIDO_PADRE2;
    }

    public void setCORREO_PADRE(String CORREO_PADRE) {
        this.CORREO_PADRE = CORREO_PADRE;
    }

    public void setNOMBRE_PADRE(String NOMBRE_PADRE) {
        this.NOMBRE_PADRE = NOMBRE_PADRE;
    }

    public void setTELEFONO_CONTACTO(String TELEFONO_CONTACTO) {
        this.TELEFONO_CONTACTO = TELEFONO_CONTACTO;
    }

    public void setID_PADRE(int ID_PADRE) {
        this.ID_PADRE = ID_PADRE;
    }

    public void setID_PROVINCIA(int ID_PROVINCIA) {
        this.ID_PROVINCIA = ID_PROVINCIA;
    }
    
    

}
