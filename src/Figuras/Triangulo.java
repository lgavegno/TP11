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
public class Triangulo extends FigurasGeometricas implements iRetorno {

    private int base;
    private int altura;

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double retornarArea() {
        return (base * altura) / 2;
    }

    public double retornarPerimetro() {
        double ladoC = Math.pow(base, 2) + Math.pow(altura, 2);
        ladoC = Math.sqrt(ladoC);
        return base + altura + ladoC;
    }
}
