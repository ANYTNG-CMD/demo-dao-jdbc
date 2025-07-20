package application;
import java.util.Date;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		//Department obj = new Department(1,"Books");//
		//@SuppressWarnings("unused")//
		
		//Seller seller = new Seller(21,"Bob", "bob@,gmail.com", new Date(), 3000.0, obj);//
		System.out.println("Conexão válida? " + (conn != null && !conn.isClosed()));
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	
	
	
	
	}

}
