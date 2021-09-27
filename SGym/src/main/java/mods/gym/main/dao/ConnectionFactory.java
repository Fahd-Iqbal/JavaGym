package mods.gym.main.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
public class ConnectionFactory {

	private String driverClass="com.mysql.jdbc.driver";
	private String connectionURL ="jdbc:mysql://localhost:3306/javagym";
	private String dbUser = "root";
	private String dbPassword="iolnyno";
	private static ConnectionFactory connection = null; 
	
	private ConnectionFactory() {
		try {
			// this is to register the driver
			Class.forName(driverClass);
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() throws SQLException{
		// creating the connection method(user is creating to call it) 
		//
		Connection con = null; // this refrence the import of the connection type object 
		con = DriverManager.getConnection(connectionURL,dbUser,dbPassword); // giving our connection info to the imported connection
		return con; 
	}
	
	// need to get an instace of the class we created to use the instace to get the connection. 
	public static ConnectionFactory getInstance() {
		if(connection==null) {
			connection= new ConnectionFactory();
		}
		return connection;
		
	}
	
}
