/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucionej12;

import Figuras.*;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface iManejoDeFiguras {

    public static ArrayList<iRetorno> listaFiguras = new ArrayList<>();

    public static void agregarFigura(iRetorno figura) {
        listaFiguras.add(figura);
    }

    public static void sumatoriaAreaPerimetroString() {
        double perCirculo = 0, perRectangulo = 0, perTriangulo = 0;
        double areaCirulo = 0, areaRectangulo = 0, areaTriangulo = 0;
        for (iRetorno lista : listaFiguras) {
            if (lista.getClass().getSimpleName().equals("Circulo")) {
                perCirculo += lista.retornarPerimetro();
                areaCirulo += lista.retornarArea();
            }
            if (lista instanceof Triangulo) {
                perTriangulo += lista.retornarPerimetro();
                areaTriangulo += lista.retornarArea();
            }
            if (lista instanceof Rectangulo) {
                perRectangulo += lista.retornarPerimetro();
                areaRectangulo += lista.retornarArea();
            }
        }

        if (perCirculo > 0) {
            System.out.println(String.format("Circulo: Sumatoria Áreas %.2f, Sumatoria Perímetros %.2f", areaCirulo, perCirculo));
        }
        if (perRectangulo > 0) {
            System.out.println(String.format("Rectángulo: Sumatoria Áreas %.2f, Sumatoria Perímetros %.2f", areaRectangulo, perRectangulo));
        }
        if (perTriangulo > 0) {
            System.out.println(String.format("Triangulo: Sumatoria Áreas %.2f, Sumatoria Perímetros %.2f", areaTriangulo, perTriangulo));
        }
    }

    public static void listadoPerimetrosPorFigura(String figura) {
        for (iRetorno lista : listaFiguras) {
            if (lista.getClass().getSimpleName().equalsIgnoreCase(figura)) {
                System.out.println(String.format("Perímetro de figura es %.2f", lista.retornarPerimetro()));
            }
        }
    }

    public static void listadoAreasPorFigura(String figura) {
        for (iRetorno lista : listaFiguras) {
            if (lista.getClass().getSimpleName().equalsIgnoreCase(figura)) {
                System.out.println(String.format("Área de figura es %.2f", lista.retornarArea()));
            }
        }
    }

}
