package ObjectClasses;

public class GameDeveloper extends User {
   
   public GameDeveloper() {
   }
   
   @Override
   public String toString() {
      return "Account Type:Game Developer"+ " Username:" + getUsername() + " Password:" + getPassword() + " Email:" + getEmailAddress();
   }
}
