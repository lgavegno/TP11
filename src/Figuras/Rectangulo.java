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
public class Rectangulo extends FigurasGeometricas implements iRetorno{

    private int base;
    private int altura;

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double retornarArea() {
        return base * altura;
    }

    public double retornarPerimetro() {
        return (base + altura) * 2;
    }

}
