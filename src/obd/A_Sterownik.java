package obd;

public class A_Sterownik {

	//ladowanie sterownikow
		public static void sterownik() {
			
			String nazwaSterownika="oracle.jdbc.driver.OracleDriver"; //for Oracle
			
			try{
				//ładuj sterownik JDBC
				Class c=Class.forName(nazwaSterownika);
				System.out.println("Pakiet  :"+c.getPackage());
				System.out.println("Nazwa klasy  :"+c.getName());	
				System.out.println("Sterownik za�adowany");
			}
	catch (Exception e){
		//Sterownik nieodnaleziony
		System.out.println("Exception:  "+e.getMessage());
		e.printStackTrace();
		return;
	}
			
		}

	}
