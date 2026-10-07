package application;

import entities.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner str = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Entre com os dados do cliente: \n");
        System.out.print("Insira o nome do cliente \n");
        String nome = str.nextLine();
        System.out.print("Insira o email do cliente \n");
        String email = str.nextLine();
        System.out.print("Data de aniversário DD/MM/YYYY \n");
        String niver = str.nextLine();

        System.out.print("Entre com os dados do pedido: \n");
        OrderStatus status = OrderStatus.valueOf("PROCESSING");
        System.out.print("Quantos items tera o pedido? ");
        Integer n = valor.nextInt();






        str.close();
        valor.close();
    }
}
