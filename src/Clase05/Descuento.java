package Clase05;

public abstract class Descuento {
    public double valor;
    public double getValorDesc() {return valor;}
    public void setValorDesc(double valor) {
        this.valor = valor;
    }
    public abstract double valorFinal(double valorIncial);
}
