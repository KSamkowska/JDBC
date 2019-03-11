package obd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//dodanie wierszy
public class D_WypelnienieDanymi {

	

	public static void wypelnianie() {
		String url="jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
		String uzytkownik="ksamkows";
		String haslo="ksamkows";
		try{
		
			String insertIntoPrzedmiot1="INSERT INTO przedmiot(idp, nazwa_przedmiotu) VALUES (1, 'Programowanie')";
			String insertIntoPrzedmiot2="INSERT INTO przedmiot(idp, nazwa_przedmiotu) VALUES (2, 'JavaFX')";
			String insertIntoPrzedmiot3="INSERT INTO przedmiot(idp, nazwa_przedmiotu) VALUES (3, 'Struktury')";
			String insertIntoPrzedmiot4="INSERT INTO przedmiot(idp, nazwa_przedmiotu) VALUES (4, 'Testowanie')";
			String insertIntoPrzedmiot5="INSERT INTO przedmiot(idp, nazwa_przedmiotu) VALUES (5, 'Bazy_danych')";
			
			String insertIntoNauczyciel1 = "INSERT INTO nauczyciel(idn, nazwisko_nauczyciela, imie_nauczyciela)"
					+ "VALUES (1, 'Sliwa', 'Leszek')";
			String insertIntoNauczyciel2 = "INSERT INTO nauczyciel(idn, nazwisko_nauczyciela, imie_nauczyciela)"
					+ "VALUES (2, 'Szymanski', 'Zbigniew')";
			String insertIntoNauczyciel3 = "INSERT INTO nauczyciel(idn, nazwisko_nauczyciela, imie_nauczyciela)"
					+ "VALUES (3, 'Pajak', 'Andrzej')";
			String insertIntoNauczyciel4 = "INSERT INTO nauczyciel(idn, nazwisko_nauczyciela, imie_nauczyciela)"
					+ "VALUES (4, 'Derezinska', 'Anna')";
			String insertIntoNauczyciel5 = "INSERT INTO nauczyciel(idn, nazwisko_nauczyciela, imie_nauczyciela)"
					+ "VALUES (5, 'Kaminski', 'Wojciech')";
			
			String insertIntoUczen1="INSERT INTO uczen (idu ,nazwisko_ucznia , imie_ucznia ) VALUES (1,'Kowalski', 'Jan')";
			String insertIntoUczen2="INSERT INTO uczen (idu ,nazwisko_ucznia , imie_ucznia ) VALUES (2,'Nowak', 'Anna')";
			String insertIntoUczen3="INSERT INTO uczen (idu ,nazwisko_ucznia , imie_ucznia ) VALUES (3,'Wojcik', 'Piotr')";
			String insertIntoUczen4="INSERT INTO uczen (idu ,nazwisko_ucznia , imie_ucznia ) VALUES (4,'Mazur', 'Ewa')";
			String insertIntoUczen5="INSERT INTO uczen (idu ,nazwisko_ucznia , imie_ucznia ) VALUES (5,'Zajac', 'Igor')";
			
			String insertIntoOcena1 = "INSERT INTO ocena(ido, wartosc_opisowa, wartosc_numeryczna) VALUES (1, 'niedostateczny', 1)";
			String insertIntoOcena2 = "INSERT INTO ocena(ido, wartosc_opisowa, wartosc_numeryczna) VALUES (2, 'dopuszczaj¹cy', 2)";
			String insertIntoOcena3 = "INSERT INTO ocena(ido, wartosc_opisowa, wartosc_numeryczna) VALUES (3, 'dostateczny', 3)";
			String insertIntoOcena4 = "INSERT INTO ocena(ido, wartosc_opisowa, wartosc_numeryczna) VALUES (4, 'dobry', 4)";
			String insertIntoOcena5 = "INSERT INTO ocena(ido, wartosc_opisowa, wartosc_numeryczna) VALUES (5, 'bardzo dobry', 5)";
			
			
					
					
Connection polaczenie=DriverManager.getConnection(url,uzytkownik,haslo);
			System.out.println("AutoCommit: "+polaczenie.getAutoCommit());
			Statement polecenie=polaczenie.createStatement();
			/*System.out.println("execute: "+polecenie.executeUpdate(insertIntoPrzedmiot1));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoPrzedmiot2));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoPrzedmiot3));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoPrzedmiot4));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoPrzedmiot5));
			
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoNauczyciel1));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoNauczyciel2));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoNauczyciel3));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoNauczyciel4));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoNauczyciel5));
			
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoUczen1));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoUczen2));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoUczen3));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoUczen4));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoUczen5));
			
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoOcena1));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoOcena2));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoOcena3));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoOcena4));
			System.out.println("execute: "+polecenie.executeUpdate(insertIntoOcena5));*/
			
			polecenie.executeUpdate(insertIntoPrzedmiot1);
			polecenie.executeUpdate(insertIntoPrzedmiot2);
			polecenie.executeUpdate(insertIntoPrzedmiot3);
			polecenie.executeUpdate(insertIntoPrzedmiot4);
			polecenie.executeUpdate(insertIntoPrzedmiot5);
			
			polecenie.executeUpdate(insertIntoNauczyciel1);
			polecenie.executeUpdate(insertIntoNauczyciel2);
			polecenie.executeUpdate(insertIntoNauczyciel3);
			polecenie.executeUpdate(insertIntoNauczyciel4);
			polecenie.executeUpdate(insertIntoNauczyciel5);
			
			polecenie.executeUpdate(insertIntoUczen1);
			polecenie.executeUpdate(insertIntoUczen2);
			polecenie.executeUpdate(insertIntoUczen3);
			polecenie.executeUpdate(insertIntoUczen4);
			polecenie.executeUpdate(insertIntoUczen5);
			
			polecenie.executeUpdate(insertIntoOcena1);
			polecenie.executeUpdate(insertIntoOcena2);
			polecenie.executeUpdate(insertIntoOcena3);
			polecenie.executeUpdate(insertIntoOcena4);
			polecenie.executeUpdate(insertIntoOcena5);
			System.out.println("Tabele wypelnione");
			//polaczenie.close();
			
		}catch(Exception e){
			System.out.println("Blad programu");
			e.printStackTrace();
			return;

	}
		


	}


	}
