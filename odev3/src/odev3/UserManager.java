package odev3;

public class UserManager {
 public void editProfile() {
	 System.out.println("deðiþiklikler kaydedildi");
 }
 public void adduser(User user) {
	 System.out.println(user.getFirstName()+" isimli kullanýcý eklendi");
 }
 public void logout(User user) {
	System.out.println(user.getFirstName()+" sistemden çýkýþ yaptý");
}
}
