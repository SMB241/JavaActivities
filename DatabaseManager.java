import java.sql.*;

public class DatabaseManager {
    private String url = "jdbc:mysql://localhost:3306/javadatabase";
    private String dbUser = "root";
    private String dbPassword = "";

    public void addAnimal(String id, String name,String Class, String family, String species ,String origin, String status,String endangerment, int age){
        String insertQuery = "INSERT INTO animal(id, name, Class, family, species, origin, status, endangerment, age)VALUES(?,?,?,?,?,?,?,?,?)";

        try(Connection conn = DriverManager.getConnection(url, dbUser, dbPassword)){
            PreparedStatement pst = conn.prepareStatement(insertQuery);
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, Class);
                pst.setString(4, family);
                pst.setString(5, species);
                pst.setString(6, origin);
                pst.setString(7, status);
                pst.setString(8, endangerment);
                pst.setInt(9,0);

        }catch(SQLException e){
            if (e.getErrorCode() == 1062) {
                System.out.println("Username already exists.");
            }else{
                e.printStackTrace();
            }
        }
    }
        public void searchAnimal(String id){
            String searchQuery = "SELECT "
        }

}