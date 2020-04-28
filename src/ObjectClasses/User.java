package ObjectClasses;

public abstract class User {
   
   private String Username;
   private String Password;
   private String EmailAddress;
   
   
   public String getEmailAddress() {
      return EmailAddress;
   }
   
   public void setEmailAddress(String emailAddress) {
      EmailAddress = emailAddress;
   }
   
   
   public User() {
      Username = null;
      Password = null;
   }
   
   public User(String username, String password) {
      Username = username;
      Password = password;
   }
   
   
   public User(String username, String password, String emailAddress) {
      Username = username;
      Password = password;
      EmailAddress = emailAddress;
   }
   
   public User(String username, String password, String emailAddress, boolean loStatus) {
      Username = username;
      Password = password;
      EmailAddress = emailAddress;
   }
   
   public String getUsername() {
      return Username;
   }
   
   public void setUsername(String username) {
      Username = username;
   }
   
   public String getPassword() {
      return Password;
   }
   
   public void setPassword(String password) {
      Password = password;
   }
   
   /*
   public void clickUsername(){
   Generates a popup menu for options to promote/demote different users to different statuses
   }
   */
}
