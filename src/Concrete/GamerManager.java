package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	 private UserValidationService manager;
	 
	 public GamerManager( UserValidationService manager) {//service managerin iterface impelemnti olduðu için service ten
	 
		 this.manager=manager;
	 }
	 
	
	@Override
	public void save(Gamer gamer) {
	if(manager.validation(gamer)==true) {
		System.out.println(gamer.getFirstName()+ "  " +gamer.getLastName() + " oyuncusu  eklendi ");
	}
		
	else {
		System.out.println(gamer.getFirstName()+ "  " +gamer.getLastName() + " oyuncusu  eklenemedi ");
	}
	
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ "  " +gamer.getLastName() + " oyuncusu  güncellendi ");
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getFirstName()+ "  " +gamer.getLastName() + "oyuncusu  silindi ");
	}

	

}
