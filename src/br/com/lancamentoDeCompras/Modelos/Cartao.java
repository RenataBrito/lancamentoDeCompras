package br.com.lancamentoDeCompras.Modelos;
import java.util.*;
public class Cartao {
    private double limiteCartao;

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public boolean verificarSaldo(Double valorDaCompra){
        if(valorDaCompra > this.getLimiteCartao()){
            return false;
        } else {
            this.limiteCartao = this.limiteCartao - valorDaCompra;
            return true;
        }
    }

    public void printarCompras(List<Compra> compras){
        List<Compra> comprasOrdenadas = new ArrayList<>();
        System.out.println("*********************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        comprasOrdenadas = ordernarCompras(compras);
        comprasOrdenadas.forEach(compra -> System.out.println(compra));
        System.out.println("\n*********************************");
    }

    private List<Compra> ordernarCompras(List<Compra> compras){
        compras.sort(Comparator.comparing(Compra::getValorDaCompra));
        return compras;
    }
}
