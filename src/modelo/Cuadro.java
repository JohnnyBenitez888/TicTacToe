package modelo;

import java.awt.Color;
import javax.swing.JPanel;

public class Cuadro extends JPanel{
    
    private int ancho;
    private int altura;
    private Color color;

    public Cuadro(int ancho, int altura, Color color) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        init();
    }
    
    private void init(){
        setSize(ancho, altura);
        setBackground(color);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}
