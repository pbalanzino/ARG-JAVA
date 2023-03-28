package Clase05;

public class DescuentoPorcentaje extends Descuento{
    public DescuentoPorcentaje() {
        this.setValorDesc(10);
    }

    public double valorFinal(double valorInicial){
        return valorInicial - (valorInicial * this.getValorDesc() / 100);
    }
}
