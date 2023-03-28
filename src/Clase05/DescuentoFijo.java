package Clase05;

public class DescuentoFijo extends Descuento{
    public DescuentoFijo() {
        this.setValorDesc(150);
    }

    public double valorFinal(double valorInicial){return valorInicial - this.getValorDesc();}
}
