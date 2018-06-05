package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mapBdd {
	private Statement statement;

	public mapBdd() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bdd_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false",
				/* identifiant */"root", /* password */"root");
		this.setStatement((conn.createStatement()));
	}

	public char[] getStringMap(int nbr) throws SQLException {
		ResultSet resultat = null;
		switch (nbr) {
		case 1:
			resultat = getStatement().executeQuery("CALL map1()");
			break;
		case 2:
			resultat = getStatement().executeQuery("CALL map2();");
			break;
		case 3:
			resultat = getStatement().executeQuery("CALL map3();");
			break;
		case 4:
			resultat = getStatement().executeQuery("CALL map4();");
			break;
		case 5:
			resultat = getStatement().executeQuery("CALL map5();");

			break;
		}
		resultat.next();

		return resultat.getString("mp").toCharArray();
	}

	public Statement getStatement() {

		return statement;
	}

	public void closeBDD() throws SQLException {
		this.getStatement().close();
		System.out.println("END");
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

}
