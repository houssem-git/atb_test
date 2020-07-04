package atb_test;


import java.sql.SQLException;

public class Application {

	public static void main(String[] args) {
		
		User amira=new User("Maalej","Houssem","Ariana Soghra");
		UserService marhbe=new UserService();
		
		try {
			marhbe.ajouterUser(amira);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			System.out.println(marhbe.getAllUsers());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
