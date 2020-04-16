package ObjectClasses;

public class Player extends User {
   private boolean LOStatus;
   
   public Player() {
   }
   
   public Player(String username, String password){
      super.setUsername(username);
      super.setPassword(password);
      setLOStatus(false);
   }
   public Player(String username, String password, boolean status){
      super.setUsername(username);
      super.setPassword(password);
      setLOStatus(status);
   }
   
   public boolean isLOStatus() {
      return LOStatus;
   }
   
   public void setLOStatus(boolean lOStatus) {
      LOStatus = lOStatus;
   }
   
   @Override
   public String toString() {
      return "Account Type:Player"+ " Username:" + getUsername() + " Password:" + getPassword() + " Email:" + getEmailAddress();
   }
}

