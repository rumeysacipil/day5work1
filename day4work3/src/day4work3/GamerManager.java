package day4work3;

public class GamerManager implements GamerService {

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" baþarýlý bir þekilde kaydolunmuþtur.");
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" baþarýlý bir þekilde güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+gamer.getLastName()+" baþarýlý bir þekilde silindi.");
	}

}
