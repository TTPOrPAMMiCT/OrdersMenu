package menu;

import entity.Client;
import entity.Taxist;

import java.util.Scanner;

public class NewTaxistMenu {
    public Taxist createNewTaxist() {
        Scanner scanner = new Scanner(System.in);
        Taxist taxist = new Taxist();

        System.out.println("enter name");
        String name = scanner.nextLine();

        System.out.println("enter auto name");
        String autoName = scanner.nextLine();

        System.out.println("enter experience");
        int experience = scanner.nextInt();

        taxist.setName(name);
        taxist.setNameAuto(autoName);
        taxist.setExperience(experience);

        return taxist;
    }
}
