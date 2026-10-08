package application;

import entities.*;
import entities.ItemDoPedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner str = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);


        System.out.print("Entre com os dados do cliente: \n");
        System.out.print("Insira o nome do cliente \n");
        String nome = str.nextLine();
        System.out.print("Insira o email do cliente \n");
        String email = str.nextLine();
        System.out.print("Data de aniversário DD/MM/YYYY \n");
        String niver = str.nextLine();
        Cliente cliente = new Cliente(nome, email, niver);

        System.out.print("Entre com os dados do pedido: \n");
        OrderStatus status = OrderStatus.valueOf(str.nextLine());
        System.out.print("Quantos items tera o pedido? ");
        int n = valor.nextInt();
        Pedido pedido = new Pedido(LocalDate.now(), status);

        for (int i = 1; i <= n; i++) {

            System.out.print("Entre com os dados do %d° item \n".formatted(i));
            System.out.print("Nome do produto: \n");
            String nomeProd = str.nextLine();
            System.out.print("Preço do produto: \n");
            Double priceProd = valor.nextDouble();
            System.out.print("Insira a quantidade: \n");
            Integer quantity = valor.nextInt();

            ItemDoPedido item = new ItemDoPedido(nomeProd, priceProd, quantity);
            pedido.addItem(item);
        }

        System.out.print("Sumário do pedido: \n");
        System.out.println(pedido);




        str.close();
        valor.close();
    }
}
