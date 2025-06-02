import java.sql.*;

public class DatabaseManager {
    private String url = "jdbc:mysql://localhost:3306/javadatabase";
    private String dbUser = "root";
    private String dbPassword = "";

    public boolean addAnimal(String id, String name,String Class, String family, String species ,String origin, String status,String endangerment, int age){
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

                int rowsAffected = pst.executeUpdate();
                return rowsAffected > 0;
        }catch(SQLException e){
            if (e.getErrorCode() == 1062) {
                System.out.println("Username already exists.");
            }else{
                e.printStackTrace();
            }
        }
        return false;
    }

        public boolean searchAnimal(String id){
        String searchQuery = "SELECT * FROM animal WHERE  id = ?";
        try(Connection conn =DriverManager.getConnection(url,dbUser, dbPassword);
            PreparedStatement pst =conn.prepareStatement(searchQuery)){
                pst.setString(1, id);
                
                try(ResultSet rs = pst.executeQuery()){
                    return rs.next();
                }
            }catch(SQLException e ){
                e.printStackTrace();
                return false;
            }
        }

    public boolean treatmentStatus(String id, String status){
        String updateQuery = "UPDATE animal SET status = ? WHERE id = ?";
    
        try(Connection conn =DriverManager.getConnection(url,dbUser, dbPassword);
            PreparedStatement pst =conn.prepareStatement(updateQuery)){
                pst.setString(1, status);
                pst.setString(2, id);
                
                int rowsAffected = pst.executeUpdate();
                return rowsAffected > 0;
        }catch(SQLException e){
            if (e.getErrorCode() == 1062) {
                System.out.println("Invoice already paid");
            }else{
                e.printStackTrace();
            }
            return false;
        }
    }
}

