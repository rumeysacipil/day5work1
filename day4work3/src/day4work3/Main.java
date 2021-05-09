package day4work3;



public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1, "rumeysa", "çipil", "14155254632", 2000);
		GamerManager gamerManager=new GamerManager();
		gamerManager.update(gamer);
		gamerManager.register(gamer);
		
		
        Campaign campaign=new Campaign(1,"Bahar İndirimi",20);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		
		Game game=new Game(1,"Valorant",250);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.discount(game, campaign);
		
		SaleManager saleManager=new SaleManager();
		saleManager.sell(gamer, campaign, game);
		
		ValidationManager validationManager=new ValidationManager();
		validationManager.validation(gamer);
		
	}

	}


