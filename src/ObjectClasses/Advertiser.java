package ObjectClasses;

public class Advertiser extends User {
   
   public Advertiser(String username,String password, String email){
      setUsername(username);
      setPassword(password);
      setEmailAddress(email);
   }
   
   public Advertiser() {
   }
   
   @Override
   public String toString() {
      return "Account Type:Advertiser"+ " Username:" + getUsername() + " Password:" + getPassword() + " Email:" + getEmailAddress();
   }
}
