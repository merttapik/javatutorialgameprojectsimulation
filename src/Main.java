import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.OrderManager;
import Concrete.UserValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1=new Game(8,"LastofUs",450);
		Gamer gamer1=new Gamer(1,"mert","tapik",2000,"12325475865");
		GamerManager gamerManager1=new GamerManager(new UserValidationManager());// enjection yaptýgýmýz için user validationservice i implement eden uservalidationManager ý yazýyoruz
		gamerManager1.save(gamer1);
		Campaign campaign1=new Campaign(2,"Yaz indirimi");
		CampaignManager campaignManager1= new CampaignManager();
		campaignManager1.add(campaign1);
		OrderManager orderManager = new OrderManager(new UserValidationManager());
		orderManager.order(gamer1, game1, campaign1);

		//Gamer gamer2=new Gamer(1,"berk","tapik",2000,"1232475865");
		gamerManager1.save(new Gamer(1,"berk","tapik",2000,"1232475865"));//bu sekildede olusturulabilir
		orderManager.order(new Gamer(1,"berk","tapik",2000,"1232475865") , game1, campaign1);
	}

}
