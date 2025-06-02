import java.sql.SQLException;
import java.util.Scanner;

public class Animal extends AnimalSpecies{
    Scanner sc = new Scanner(System.in);
    protected String animalID;


    database databaseManager;
    public Animal(String animalClass, String animalFamily, String animalSpecies, database databaseManager){
        super(animalClass, animalFamily, animalSpecies);
        this.databaseManager = databaseManager;
    }



    public void release(){

    }

    public void updateStatus(String animalID, String newStatus ) throws SQLException {
        if(databaseManager.changeStatus(animalID, newStatus)){
            System.out.println("Status updated successfully!");
        }else{
            System.out.println("Status update unsuccessful!");
        }
    }


    @Override
    public void addAnimal(String place) throws SQLException {
        if (place.equalsIgnoreCase("breed")){
            getInfoBreed();
        } else if (place.equalsIgnoreCase("rescue")) {
            getInfoRescue();
        }
    }

    public void getInfoBreed() throws SQLException {
        System.out.println("Enter Animal ID: ");
        this.animalID = sc.next();

        System.out.println("Enter Mother ID: ");
        String motherID = sc.next();

        System.out.println("Enter Father ID: ");
        String fatherID = sc.next();

        System.out.println("Enter Date: ");
        String date = sc.next();

        this.databaseManager.breed(animalID,motherID,fatherID,date);
    }


    public void getInfoRescue() throws SQLException {
        System.out.println("Enter Animal ID: ");
        this.animalID = sc.next();

        System.out.println("Enter Location: ");
        String location = sc.next();

        System.out.println("Enter date: ");
        String date = sc.next();


        this.databaseManager.rescue(animalID,location,date);
    }



    public void getInfoAllData(){
        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Origin: ");
        String origin = sc.next();

        System.out.print("Enter status: ");
        String status = sc.next();

        System.out.print("Enter endangerment: ");
        String endangerment = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        this.databaseManager.addAnimal(name,getAnimalClass(), getFamily(),
                getSpecies(), origin, status, endangerment, age, this.animalID );

    }
}
