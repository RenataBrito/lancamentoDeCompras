package br.com.lancamentoDeCompras.Modelos;
import java.util.*;

public class Compra {
    private String descricao;
    private double valorDaCompra;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public Compra(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.getDescricao() + " - " + this.getValorDaCompra();
    }
}
