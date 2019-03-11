package obd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//dodanie nowej tabeli z poszczegolnymi kolumnami
public class C_DodawanieTabeli {
	public static void dodawanie() {

		try{
			String url="jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
			String uzytkownik="ksamkows";
			String haslo="ksamkows";
			String createPrzedmiot="CREATE TABLE przedmiot (idp integer not null,nazwa_przedmiotu char(20) not null)";
			String createUczen="CREATE TABLE uczen (idu integer not null,nazwisko_ucznia char(30) not null, imie_ucznia char(20) not null)";
			String createNauczyciel="CREATE TABLE nauczyciel (idn integer not null,nazwisko_nauczyciela char(30) not null, imie_nauczyciela char(20) not null)";
			String createOcena="CREATE TABLE ocena (ido integer not null,wartosc_opisowa char(20) not null, wartosc_numeryczna float not null)";
			String createOcenianie="CREATE TABLE ocenianie (rodzaj_oceny char(1) not null, ido integer not null,idp integer not null, idu integer not null,idn integer not null )";
			
					
Connection polaczenie=DriverManager.getConnection(url,uzytkownik,haslo);
			System.out.println("AutoCommit: "+polaczenie.getAutoCommit());
			Statement polecenie=polaczenie.createStatement();
			/*System.out.println("execute: "+polecenie.execute(createPrzedmiot));
			System.out.println("execute: "+polecenie.execute(createUczen));
			System.out.println("execute: "+polecenie.execute(createNauczyciel));
			System.out.println("execute: "+polecenie.execute(createOcena));
			System.out.println("execute: "+polecenie.execute(createOcenianie));*/
			
			polecenie.execute(createPrzedmiot);
			polecenie.execute(createUczen);
			polecenie.execute(createNauczyciel);
			polecenie.execute(createOcena);
			polecenie.execute(createOcenianie);
			System.out.println("Tabele dodane");
			//polaczenie.close();
			
		}catch(Exception e){
			System.out.println("Blad programu");
			e.printStackTrace();
			//return;

	}
}}

