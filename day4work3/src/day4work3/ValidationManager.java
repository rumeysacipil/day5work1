package day4work3;

public class ValidationManager implements ValidationService {

	@Override
	public boolean validation(Gamer gamer) {
		   if(gamer.getIdentity().length()==11 && gamer.getDateofBirth()<2004) {
			return true;
		   }
		   else {
			return false;
		}
	}

}
