
package Clases;

import Interfaces.ISaldos;


public class PersonalAdministrativo extends Empleados implements ISaldos
{
    private String sector;

    public PersonalAdministrativo(String codigos, String nombres, String apellidos, String DNI , String sector) {
        super(codigos, nombres, apellidos, DNI);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    @Override
    public String toString()
    {
        return super.toString()
                +"\nSector: "+sector;
    }

    @Override
    public void calcularS() 
    {
        
    }

    @Override
    public double getSaldo() 
    {
       return getSaldo();
    }
    
}
