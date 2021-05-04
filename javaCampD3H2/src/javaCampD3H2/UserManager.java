package javaCampD3H2;

public class UserManager {
	
	public void login(User user){
		System.out.println(user.getName()+" "+ user.getLastName()+" "+ "Tebrikler ! " + " " + "Giris Basarili. . . ");
		System.out.println(user.getEmail() + "Adresiyle giris yaptiniz.. ");
	}
	public void logout(User user){
		System.out.println(user.getName()+" "+ user.getLastName()+" "+ "Cikis yapildi. . .");
	}
}
