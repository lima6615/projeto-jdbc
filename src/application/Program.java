package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1,"Books");
		
		Seller seller = new Seller(21,"Leoanrdo","leo@gmail.com" ,sdf.parse("15/03/1999"),3000.0 , obj);
		System.out.println(seller);

	}

}
