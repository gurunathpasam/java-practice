
public class TesConnection {

	public static void main(String[] args) {
		try {
			Class.forName("java.sql.Driver");
			System.out.println("driver loaded ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
