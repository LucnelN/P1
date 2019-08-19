package MainDriver;

import DAO.UsersDaoImpl;

public class Main {

	public static void main(String[] args) {

		UsersDaoImpl UsersDaoImpl = new UsersDaoImpl();
		//UsersDaoImpl.getUsersByRole("EMP");
		System.out.println(UsersDaoImpl.getUsersByRole("MAN"));
		//System.out.println(UsersDaoImpl.getUsersByUsername("luke"));
		//for(Users u : UsersDaoImpl.getAllUsers()) {
			//System.out.println(u);
		//}
		
	}
	}


