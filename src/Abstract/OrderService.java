package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface OrderService {

	void order(Gamer gamer,Game game,Campaign campaign);
}
