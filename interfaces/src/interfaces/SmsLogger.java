package interfaces;

public class SmsLogger implements Logger{//implements loggerý sms loggera uyarla demek

	@Override
	public void log(String message) {
 System.out.println("sms gönderildi: "+message);		
	}


}
