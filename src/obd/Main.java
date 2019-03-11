package obd;

public class Main {

	static String url="jdbc:oracle:thin:@ora3.elka.pw.edu.pl:1521:ora3inf";
	static String uzytkownik="ksamkows";
	static String haslo="ksamkows";
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	try {
		E_Ocenianie.openConnection();
		
F_usuwanieTabeli.usuwanie();

		A_Sterownik.sterownik();
		//B_LaczenieZBaza.baza();
		C_DodawanieTabeli.dodawanie();
		D_WypelnienieDanymi.wypelnianie();
		E_Ocenianie.ocenianie();
		E_Ocenianie.closeConnection();
	
	}
catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	E_Ocenianie.closeConnection();
}
}
}


