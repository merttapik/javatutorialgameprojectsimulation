package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean validation(Gamer gamer) {
		if (gamer.getFirstName().length() >=3 && gamer.getLastName().length() >=2 && gamer.getBirthYear() <=2010 && gamer.getNationalId().length()==11 ) {
			return true;
		}else {return false; }
		
	}

}
