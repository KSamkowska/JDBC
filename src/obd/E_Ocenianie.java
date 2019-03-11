package obd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// dodawanie kolejnych wierszy w tabeli ocenianie
public class E_Ocenianie {
	private static boolean ocenianie = false;
	private static Scanner input = new Scanner(System.in);
	private static Connection polaczenie;
	private static Statement polecenie;
	private static ResultSet rs;
	
	

	
	
	public static void openConnection() {
		try {
			String url="jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
			String uzytkownik="ksamkows";
			String haslo="ksamkows";
			polaczenie = DriverManager.getConnection(url,uzytkownik,haslo);
			polecenie = polaczenie.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	public static void closeConnection() {
		try {
			polaczenie.close();
		} catch (SQLException e) {
			System.out.println("B³¹d programu!");
			e.printStackTrace();
		}
	}
	public static void insertOcenianie(String sql) {
		try {
			System.out.println("execute: " + polecenie.executeUpdate(sql));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void ocenianie() {
		System.out.println("Czy chcesz wystawiæ ocenê [t/n] :");
		char yesOrNot = input.next().charAt(0);

		if (Character.toUpperCase(yesOrNot) == 'T') {
			ocenianie = true;
			//openConnection();
		} else {
			ocenianie=false;
		System.out.println("Koniec");
		closeConnection();
		}
		
		
//try {
	while(ocenianie) {
			System.out.println("\nWprowadŸ rodzaj oceny ['C' - cz¹stkowa, 'S' - semestralna] :");
			char rodzajOceny = Character.toUpperCase(input.next().charAt(0));

			System.out.println("\nWprowadŸ id przedmiotu spoœród wymienionych poni¿ej:");
			//checkTable("SELECT idp FROM Przedmiot","idp");
			int przedmiot = input.nextInt();
			
			
			System.out.println("\nWprowadŸ id nauczyciela:");
			//checkTable("SELECT idn FROM Nauczyciel", "idn");
			int nauczyciel = input.nextInt();
	

			System.out.println("\nWprowadŸ id ucznia :");
			checkTable("SELECT idu FROM Uczen", "idu");
			int uczen = input.nextInt();
			

			System.out.println("\nWprowadŸ id oceny :");
			checkTable("SELECT ido FROM Ocena", "ido");
			int ocena = input.nextInt();
			
		
		
			if (rodzajOceny == 'C' || rodzajOceny == 'S') {
				if(checkPrzedmiot(przedmiot)) {
					if(checkNauczyciel(nauczyciel))  {
						if(checkUczen(uczen))  {
							if(checkOcena(ocena))  {

								insertOcenianie("INSERT INTO ocenianie(rodzaj_oceny, idp, idn, idu, ido) VALUES "
										+ "('" + rodzajOceny + "'," + przedmiot + "," + nauczyciel + "," + uczen + ","
										+ ocena + ")");
								//polecenie.executeUpdate(insertOcenianie);
								System.out.println("Dodano dane do tabeli Ocenianie");
								
							} else
								System.out.println("Oceny nie ma na liœcie");
						} else
							System.out.println("Ucznia nie ma na liœcie");
					} else
						System.out.println("Nauczyciela nie ma na liœcie");
				} else
					System.out.println("Przedmiotu nie ma na liœcie");
			} else {
				System.out.println("Rodzaj oceny musi byæ 'C' lub 'S'\n");
			}
			System.out.println("Czy chcesz oceniaæ kolejnego ucznia [t/n]: \n");

			yesOrNot = input.next().charAt(0);
			if (Character.toUpperCase(yesOrNot) != 'T') {
				ocenianie = false;
			}
		}
	System.out.println("Koniec procesu oceniania");
	closeConnection();
	
/*}catch(Exception e) {
	
	e.printStackTrace();
}
	*/
	
	}
	public static boolean checkPrzedmiot(int przedmiot) {
		boolean exist = false;
		try {
			
			rs = polecenie.executeQuery("SELECT * FROM przedmiot WHERE idp = " + przedmiot);
			exist = rs.next();
			rs.close();
		} catch (SQLException e) {
			System.out.println("wartosc nieprawidlowa\n");
			e.printStackTrace();
		}
		return exist;
	}
	
	public static boolean checkNauczyciel(int nauczyciel) {
		boolean exist = false;
		try {
			
			rs = polecenie.executeQuery("SELECT * FROM nauczyciel WHERE idn = " + nauczyciel);
			exist = rs.next();
			rs.close();
		} catch (SQLException e) {
			System.out.println("wartosc nieprawidlowa\n");
			e.printStackTrace();
		}
		return exist;
	}
	public static boolean checkUczen(int uczen) {
		boolean exist = false;
		try {
			
			rs = polecenie.executeQuery("SELECT * FROM uczen WHERE idu = " + uczen);
			exist = rs.next();
			rs.close();
		} catch (SQLException e) {
			System.out.println("wartosc nieprawidlowa\n");
			e.printStackTrace();
		}
		return exist;
	}
	public static boolean checkOcena(int ocena) {
		boolean exist = false;
		try {
			
			rs = polecenie.executeQuery("SELECT * FROM ocena WHERE ido = " + ocena);
			exist = rs.next();
			rs.close();
		} catch (SQLException e) {
			System.out.println("wartosc nieprawidlowa\n");
			e.printStackTrace();
		}
		return exist;
	}
	
	
	public static void checkTable(String sql, String id) {
			try {
		ResultSet rs=polecenie.executeQuery(sql);
				while(rs.next()){
				System.out.print(rs.getInt(id)+", ");
				
				}
				rs.close();}
			catch (SQLException e) {
				e.printStackTrace();
			}}
	
}