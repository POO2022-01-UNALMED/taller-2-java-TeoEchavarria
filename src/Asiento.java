package test;
public class Asiento {
    String color;
    int precio;
    int registro;

    void cambiarColor(String color) {
        if (color==("amarillo")||(color=="rojo")||(color=="verde")||(color=="negro")||(color=="blanco")){
            this.color=color;
        }
    }
}