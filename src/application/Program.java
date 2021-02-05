package application;


import java.util.Date;
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
		
		System.out.println("Teste4 : Seller novo");
		Seller newSeller = new Seller(null, "Greg", "greg@", new Date(), 4000.0, department);
		
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
		
		System.out.println("Teste 5  : Seller update: ------------");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Nome do vendedor" + seller.getName());
		}
	}


