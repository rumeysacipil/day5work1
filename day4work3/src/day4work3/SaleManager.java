package day4work3;

public class SaleManager implements SaleService {

	@Override
	public void sell(Gamer gamer, Campaign campaign, Game game) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu " + game.getName() +"  oyununu" 
				 +campaign.getCampaignName() + "  kampanyayla oyunu satýn aldý"); 
					 System.out.println(campaign.getCampaignRate() + " indirim uygulandý");
					 
		
	}

}
