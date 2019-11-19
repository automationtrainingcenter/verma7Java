package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To work with database we have gather the following information 
 * 1. DB technology (MSSQL Server, MYSQL, Oracle, DB2 ..etc) 
 * 2. DB Server address 
 * 3. DB credentials
 * 4. Database Name we want to connect to 
 * 5. Table Name on which we want to perform the operations
 * 6. Column Names and their data types
 */
public class DataBaseDemo {
	public static void main(String[] args) {
		/*
		 * Load the Driver class related to the DB technology dynamically using
		 * forName() method of Class class
		 */
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			/*
			 * Create connection to the required database by calling getConnection() method
			 * of DriverManager class and storing reference in Connection class object
			 */
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "user1", "password");

			/*
			 * Create Statement class object by calling createStatement() method of
			 * Connection class so that we can execute SQL queries
			 */
			Statement statement = con.createStatement();

			/*
			 * Execute SQL queries using executeQuery() method of Statement class and store
			 * the results in ResultSet class object
			 */
			ResultSet rs = statement.executeQuery("select * from city where District='Uttar Pradesh'");

			/* Iterate over the results using next() method of ResultSet class */
			while (rs.next()) {
				System.out.println(rs.getLong("ID") + "\t" + rs.getString("Name") + "\t" + rs.getString("CountryCode")
						+ "\t" + rs.getString("District") + "\t" + rs.getInt("Population"));
			}

			/* Close the data base connection using close() method of Connection class */
			con.close();
//			System.out.println(citisOfGBR);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
