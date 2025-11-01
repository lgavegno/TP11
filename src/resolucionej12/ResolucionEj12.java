/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucionej12;

import Figuras.Circulo;
import Figuras.Triangulo;

/**
 *
 * @author diego
 */
public class ResolucionEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cir1 = new Circulo();
        cir1.setRadio(5);
        Circulo cir2 = new Circulo();
        cir2.setRadio(15);
        Triangulo tri1 = new Triangulo();
        tri1.setBase(5);
        tri1.setAltura(10);

        iManejoDeFiguras.agregarFigura(cir1);
        iManejoDeFiguras.agregarFigura(tri1);
        iManejoDeFiguras.agregarFigura(cir2);

        iManejoDeFiguras.sumatoriaAreaPerimetroString();
        iManejoDeFiguras.listadoPerimetrosPorFigura("circulo");
        iManejoDeFiguras.listadoAreasPorFigura("circulo");
        iManejoDeFiguras.listadoPerimetrosPorFigura("triangulo");
        iManejoDeFiguras.listadoAreasPorFigura("triangulo");

    }

}
