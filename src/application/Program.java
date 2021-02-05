package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("Find by ID: -------:");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("Teste 2: Seler find by deparment");
		Department department = new Department(2, null);
		
		List<Seller> list =  sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Teste3 : Seler find All");
				
		list =  sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
	
	}

}
