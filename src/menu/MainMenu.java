package menu;
import entity.Client;
import entity.Order;
import entity.Taxist;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    ArrayList<Client> clients = new  ArrayList<>();
    ArrayList<Taxist> taxists = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

   public void mainMenu() {
       Scanner scanner = new Scanner(System.in);
       boolean jobProgram = true;
       while (jobProgram) {
           System.out.println("1 create client, 2 create taxist, 3 create order, 4 output orders in slave, 5 exit program");
           int act = scanner.nextInt();
           switch (act) {
               case 1: {
                   NewClientMenu newClientMenu = new NewClientMenu();
                   clients.add(newClientMenu.createClient());
                   break;
               }
               case 2: {
                   NewTaxistMenu newTaxistMenu = new NewTaxistMenu();
                   taxists.add(newTaxistMenu.createNewTaxist());
                   break;
               }
               case 3: {
                   NewOrderMenu newOrderMenu = new NewOrderMenu();
                   if (checkFreePeople() == true) {
                       orders.add(newOrderMenu.createOrder(clients, taxists));
                       formatStatusClientOrTaxist();
                   }
                   break;
               }
               case 4: {
                   delete();
                   for (int i = 0; i < orders.size(); i++) {
                       System.out.println(orders.get(i));
                   }
                   break;
               }
               case 5: {
                   jobProgram = false;
                   break;
               }
           }
       }
   }

   public void formatStatusClientOrTaxist() {
       clients.get(orders.get(orders.size() - 1).getClientId()).setStatusOrder(true);
       taxists.get(orders.get(orders.size() - 1).getTaxistId()).setStatusOrder(true);
   }

   public void delete() {
       for (int i = 0; i < orders.size(); i++) {
           if (orders.get(i).isStatusOrder() == false || orders.get(i).isStatusOrder() == false) {
               orders.remove(i);
           }
       }
   }

   public boolean checkFreePeople() {
       int checkQuantityPeople = 0;
       for (int i = 0; i < clients.size(); i++) {
           if (clients.get(i).isStatusOrder() == false) {
               checkQuantityPeople++;
           }
       }
       
       int checkFreeTaxists = 0;
       for (int i = 0; i < taxists.size();i++){
           if (taxists.get(i).isStatusOrder() == false) {
               checkFreeTaxists++;
           }
       }

       boolean thereIs = false;
       if (checkQuantityPeople > 0) {
            thereIs = true;
       } else {
           thereIs = false;
           System.out.println("not clients");
       }

       if (checkFreeTaxists > 0) {
           thereIs = true;
       } else {
           thereIs = false;
           System.out.println("not free taxists");
       }

       return thereIs;
   }
}