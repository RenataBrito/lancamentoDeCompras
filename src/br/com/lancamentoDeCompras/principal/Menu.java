package br.com.lancamentoDeCompras.principal;
import br.com.lancamentoDeCompras.Modelos.Cartao;
import br.com.lancamentoDeCompras.Modelos.Compra;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        int opc = 1;
        double limiteCartao;
        String descricaoCompra;
        double valorDaCompra;
        List<Compra> compras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartao:");
        limiteCartao = scanner.nextDouble();
        scanner.nextLine(); //pra nao travar pq foi double
        Cartao cartao1 = new Cartao(limiteCartao);

        while(opc == 1){
            System.out.println("Digite a descricao da compra:");
            descricaoCompra = scanner.nextLine();
            Compra compra1 = new Compra(descricaoCompra);
            System.out.println("Digite o valor da compra:");
            valorDaCompra = scanner.nextDouble();
            scanner.nextLine();
            compra1.setValorDaCompra(valorDaCompra);
            if(cartao1.verificarSaldo(compra1.getValorDaCompra())){
                compras.add(compra1);
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }
            System.out.println("Digite 0 para sair ou 1 para continuar");
            opc = scanner.nextInt();
            scanner.nextLine();
        }

        cartao1.printarCompras(compras);
        System.out.println("\n Saldo do cartao: " + cartao1.getLimiteCartao());

        scanner.close();
    }
}
