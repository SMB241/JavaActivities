import java.sql.*;

public class database {
    String url = "jdbc:mysql://localhost:3306/animal";
    String username = "root";
    String dbPassword = "";


    private Connection getConnect() throws SQLException {
        return DriverManager.getConnection(url,username,dbPassword);
    }

    public boolean breed(String animalId, String motherId, String fatherId, String bDay) throws SQLException {
        String query = "INSERT INTO breed (animalID, motherID, fatherID, birthdate) VALUES (?,?,?,?)";
        try(Connection conn = getConnect()){
            try(PreparedStatement pst = conn.prepareStatement(query)){
                pst.setString(1,animalId);
                pst.setString(2,motherId);
                pst.setString(3,fatherId);
                pst.setString(4,bDay);
                int rowsAffected = pst.executeUpdate();
                String result = (rowsAffected > 0) ? "Insert Successfully" : "Insert Failed";
                System.out.println(result);
            }
        }
        return false;
    }


    public boolean rescue(String animalId, String location, String date) throws SQLException {
        String query = "INSERT INTO rescue (animalID, location, dateRescued) VALUES (?,?,?)";
        try(Connection conn = getConnect()){
            try(PreparedStatement pst = conn.prepareStatement(query)){
                pst.setString(1,animalId);
                pst.setString(2,location);
                pst.setString(3,date);
                int rowsAffected = pst.executeUpdate();
                String result = (rowsAffected > 0) ? "Insert Successfully" : "Insert Failed";
                System.out.println(result);
            }
        }
        return false;
    }

    public boolean addAnimal(String name,String Class, String family, String species ,String origin, String status,String endangerment, int age, String animalID){
        String insertQuery = "INSERT INTO animal(name, class, family, species, origin, status, endangerment, age, animalID)VALUES(?,?,?,?,?,?,?,?,?)";

        try(Connection conn = getConnect()){
            try(PreparedStatement pst = conn.prepareStatement(insertQuery)){
                pst.setString(1, name);
                pst.setString(2, Class);
                pst.setString(3, family);
                pst.setString(4, species);
                pst.setString(5, origin);
                pst.setString(6, status);
                pst.setString(7, endangerment);
                pst.setInt(8,age);
                pst.setString(9, animalID);
                int rowsAffected = pst.executeUpdate();
                return rowsAffected > 0;
            }

        }catch(SQLException e){
            if (e.getErrorCode() == 1062) {
                System.out.println("Username already exists.");
            }else{
                e.printStackTrace();
            }
        }
        return false;
    }


    public boolean searchAnimal(String id) throws SQLException {
        String searchQuery = "SELECT * FROM animal WHERE  animalID = ?";
        try(Connection conn = getConnect()){
            try(PreparedStatement pst =conn.prepareStatement(searchQuery)){
                pst.setString(1, id);

            try(ResultSet rs = pst.executeQuery()){
                return rs.next();
            }
        }catch(SQLException e ){
            e.printStackTrace();
            return false;
        }
        }
    }

    public boolean changeStatus(String id, String status) throws SQLException {
        String updateQuery = "UPDATE animal SET status = ? WHERE animalID = ?";

        try(Connection conn = getConnect()){
            try(PreparedStatement pst = conn.prepareStatement(updateQuery)){
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
}
