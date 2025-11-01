/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucionej12;

/**
 *
 * @author diego
 */
public abstract class FigurasGeometricas implements iRetorno{

    protected static int ID = 0;
    protected int identificador;
    protected String color;
    protected int posicionX;
    protected int posicionY;
    protected double angulo;

    public FigurasGeometricas() {
        setID();
        this.setIdentificador();
        
    }

    public static void setID() {
        ID++;
    }

    private void setIdentificador() {
        this.identificador = ID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public int getIdentificador() {
        return identificador;
    }
    
}
