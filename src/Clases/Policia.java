
package Clases;

import Interfaces.ISaldos;


public class Policia extends Empleados implements ISaldos
{
    private int edad,rango;
    private double saldo;

    public Policia(String nombres, String apellidos,String codigos, String DNI, int edad, int rango, double saldo) {
        super(codigos, nombres, apellidos, DNI);
        this.edad = edad;
        this.rango = rango;
        this.saldo = saldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public void calcularS() 
    {
        saldo = 120 * rango;
    }
    
    @Override
    public String toString()
    {
        return super.toString()
                +"\nEdad: "+edad
                +"\nRango: "+rango
                +"\nSaldo: "+saldo;
    }

    
}
