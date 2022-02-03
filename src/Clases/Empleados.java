
package Clases;

import Interfaces.ISaldos;


public class Empleados 
{
    private String codigos,nombres,apellidos,DNI;

    public Empleados(String codigos, String nombres, String apellidos, String DNI) {
        this.codigos = codigos;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

    public String getCodigos() {
        return codigos;
    }

    public void setCodigos(String codigos) {
        this.codigos = codigos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


    @Override
    public String toString() 
    {
        return "\nCodigo: "+codigos
               +"\nNombre: "+nombres
               +"\nApellido: "+apellidos
               +"\nDNI: "+DNI;
        
        
    }
    
    
}
