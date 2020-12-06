package menu;

import entity.Client;

import java.util.Scanner;

public class NewClientMenu {
    public Client createClient() {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("enter name");
        String name = scanner.nextLine();

        System.out.println("enter lastName");
        String lastName = scanner.nextLine();

        System.out.println("enter address");
        String address = scanner.nextLine();

        client.setName(name);
        client.setLastName(lastName);
        client.setAddress(address);

        return client;
    }
}
