package menu;

import entity.Client;
import entity.Order;
import entity.Taxist;
import java.util.ArrayList;
import java.util.Scanner;

public class NewOrderMenu {
    public Order createOrder(ArrayList<Client> clients, ArrayList<Taxist> taxists) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).isStatusOrder() == false) {
                System.out.println(i + " " + clients.get(i));
            }
        }

        for (int i = 0; i < taxists.size(); i++) {
            if (taxists.get(i).isStatusOrder() == false) {
                System.out.println(i + "" + taxists.get(i));
            }
        }

        System.out.println("enter id client");
        int idClient = scanner.nextInt();
        boolean check = true;
        while (check) {
            if (idClient >= clients.size() || idClient < 0) {
                System.out.println("not this client, enter new");
                idClient = scanner.nextInt();
            } else {
                check = false;
            }
        }

        System.out.println("enter id taxist");
        int idTaxist = scanner.nextInt();
        check = true;
        while (check) {
            if (idTaxist >= clients.size() || idTaxist < 0) {
                System.out.println("not this taxist, enter new");
                idTaxist = scanner.nextInt();
            } else {
                check = false;
            }
        }

        order.setClientId(idClient);
        order.setTaxistId(idTaxist);
        order.setTaxist(taxists.get(idClient));
        order.setClient(clients.get(idClient));
        order.setStatusOrder(true);

        return order;
    }
}
