package Concrete;

import Abstract.OrderService;
import Abstract.UserValidationService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class OrderManager implements OrderService {

	private UserValidationService manager;
	 
	 public OrderManager( UserValidationService manager) {//service managerin iterface impelemnti olduðu için service ten
	 
		 this.manager=manager;
	 }
	@Override
	public void order(Gamer gamer, Game game,Campaign campaign) {

		if(manager.validation(gamer)==true) {
			System.out.println(gamer.getFirstName()+" " +gamer.getLastName()+ "  " +"oyuncusu  "+ game.getGameName() +" oyununu  " +campaign.getCampaignName() +"  kampanyasýyla siparis etti" );
		}else {
			System.out.println(" validation hatasýndan dolayý siparis verilemedi" );
		}

		
		
		
		
	}

}
