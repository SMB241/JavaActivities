/*
import java.sql.SQLException;
import java.util.Scanner;

public class insertAnimal implements insert{
    Scanner sc = new Scanner(System.in);

    //database
    private database dataBase;

    public insertAnimal(database dataBase) {
        this.dataBase = dataBase;
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
        String animalID = sc.next();

        System.out.println("Enter Mother ID: ");
        String motherID = sc.next();

        System.out.println("Enter Father ID: ");
        String fatherID = sc.next();

        System.out.println("Enter Date: ");
        String date = sc.next();

        this.dataBase.breed(animalID,motherID,fatherID,date);
    }


    public void getInfoRescue() throws SQLException {
        System.out.println("Enter Animal ID: ");
        String animalID = sc.next();

        System.out.println("Enter Location: ");
        String location = sc.next();

        System.out.println("Enter date: ");
        String date = sc.next();


        this.dataBase.rescue(animalID,location,date);
    }

}
*/
