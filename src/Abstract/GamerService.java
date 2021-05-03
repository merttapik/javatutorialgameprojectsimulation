package Abstract;

import Concrete.UserValidationManager;
import Entities.Gamer;

public interface GamerService {

	
	void update(Gamer gamer);
	void delete(Gamer gamer);
	void save(Gamer gamer);
}
