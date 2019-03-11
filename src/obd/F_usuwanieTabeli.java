package obd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//usuwanie tabeli z poszczegolnymi kolumnami
public class F_usuwanieTabeli {
	public static void usuwanie() {

		try{
			System.out.println("Usuwanie zbednych tabel");
			String url="jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
			String uzytkownik="ksamkows";
			String haslo="ksamkows";
			String dropPrzedmiot="DROP TABLE przedmiot";
			String dropUczen="DROP TABLE uczen ";
			String dropNauczyciel="drop TABLE nauczyciel ";
			String dropOcena="DROP TABLE ocena";
			String dropOcenianie="DROP TABLE ocenianie ";
			
					
Connection polaczenie=DriverManager.getConnection(url,uzytkownik,haslo);
			System.out.println("AutoCommit: "+polaczenie.getAutoCommit());
			Statement polecenie=polaczenie.createStatement();
			System.out.println("execute: "+polecenie.executeUpdate(dropPrzedmiot));
			System.out.println("execute: "+polecenie.executeUpdate(dropUczen));
			System.out.println("execute: "+polecenie.executeUpdate(dropNauczyciel));
			System.out.println("execute: "+polecenie.executeUpdate(dropOcena));
			System.out.println("execute: "+polecenie.executeUpdate(dropOcenianie));
			System.out.println("Tabele usuniete");
			//polaczenie.close();
			
		}catch(SQLException e) {
			System.out.println("Brak tabel do usuniecia");
			//e.printStackTrace();
			//return;

	}
		
}}

