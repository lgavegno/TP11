/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import resolucionej12.FigurasGeometricas;
import resolucionej12.iRetorno;

/**
 *
 * @author diego
 */
public class Circulo extends FigurasGeometricas implements iRetorno{
    
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double retornarArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double retornarPerimetro() {
        return Math.PI * (radio * 2);
    }

}
