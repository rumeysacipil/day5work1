package day4work3;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" için geçerli"+  campaign.getCampaignRate()+"  oranýnda kampanya eklenmiþtir");
		
	}

	@Override
	public void update(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" için geçerli"+  campaign.getCampaignRate()+"  oranýnda kampanya güncellenmiþtir.");
		   
		
	}

	@Override
	public void delete(Campaign campaign) {
		 System.out.println(campaign.getCampaignName()+" için geçerli"+  campaign.getCampaignRate()+"  oranýnda kampanya silinmiþtir.");
		   
		
	}
	

}
