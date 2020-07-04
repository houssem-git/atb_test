package atb_test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserService {
	Connection connexion;
	   

    public UserService() {
       connexion=ConnectionDB.getInstance().getConnexion();
    }

    void ajouterUser(User p) throws SQLException {
        String req = "INSERT INTO `User` (`name`, `last name`) VALUES ( '"
                + p.getName() + "', '" + p.getLastName() + "') ";
        // create a statement object te send to the Data Base
        Statement stm = connexion.createStatement();
        //Execute the statement
        stm.executeUpdate(req);
    }

    void ajouterUser2(User p) throws SQLException {
        String req = "INSERT INTO `User` (`nom`, `prenom`) VALUES ( ?, ?) ";
        PreparedStatement pstm = connexion.prepareStatement(req);
        pstm.setString(1, p.getName());
        pstm.setString(2, p.getLastName());
        pstm.executeUpdate();
    }

    List<User> getAllUsers() throws SQLException {
       List<User> Users = new ArrayList<>();
        
        String req = "select * from User";
        Statement stm = connexion.createStatement();
        ResultSet result =  stm.executeQuery(req);
        
        while(result.next()){
            User p = new User(result.getInt(1), result.getString("name"), result.getString("last name"),result.getString("email"));
            Users.add(p);
        }
        
        return Users;
    }

}
