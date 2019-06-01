package Model;

import java.sql.Connection;
import Database.Database;

public class AppModel {
	public static Connection connection = Database.getConexaoMySQL();

}
