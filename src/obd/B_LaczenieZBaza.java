package obd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//polaczenie z baza danych
public class B_LaczenieZBaza {

	public static void baza() {

		try{
			String url="jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
			String uzytkownik="ksamkows";
			String haslo="ksamkows";
			
			Connection polaczenie=DriverManager.getConnection(url,uzytkownik,haslo);
			System.out.println("AutoCommit: "+polaczenie.getAutoCommit());
			polaczenie.close();
		
		}catch(SQLException e){
			System.out.println("Nieudane polaczenie z baza danych");
			e.printStackTrace();
			return;
		}
		System.out.println("Po³¹czono z baz¹ danych");

	}

}

