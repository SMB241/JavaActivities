import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Insert");
        System.out.println("2. Release");
        System.out.println("3. Update");
        System.out.println("4. Display");
        System.out.println("5. Exit");

        System.out.print("Enter your Choice: ");
        String choice = sc.next();

        switch (choice){
            case "1":
                String animalFamily = "";
                database insertDb = new database();
                System.out.println("mammal");
                System.out.println("reptile");
                System.out.println("bird");
                System.out.print("Animal Class: ");
                String animalClass = sc.next();

                if ("mammal".equalsIgnoreCase(animalClass)){
                    System.out.println("rodentia");
                    System.out.println("carnivora");
                    System.out.println("primate");
                    System.out.print("Enter your choice: ");
                    animalFamily = sc.next();
                } else if ("reptile".equalsIgnoreCase(animalClass)) {
                    System.out.println("squamata");
                    System.out.println("crocodilia");
                    System.out.println("testudines");
                    System.out.print("Enter your choice: ");
                    animalFamily = sc.next();
                } else if ("bird".equalsIgnoreCase(animalClass)) {
                    System.out.println("accipitridae");
                    System.out.println("anatidae");
                    System.out.println("passeriformes");
                    System.out.print("Enter your choice: ");
                    animalFamily = sc.next();
                }

                System.out.print("Enter Species: ");
                String species = sc.next();

                Animal insert = new Animal(animalClass,animalFamily,species,insertDb);
                System.out.println("Breed");
                System.out.println("Rescue");
                System.out.print("Enter your choice: ");
                String insertChoice = sc.next();

                insert.addAnimal(insertChoice);
                insert.getInfoAllData();

                break;
            case "2":

        }
    }
}