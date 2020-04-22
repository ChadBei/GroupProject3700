package ObjectClasses;

import root.Main;

import java.util.ArrayList;

public class Database extends ArrayList<User>{
   
   //TODO Finish CreditCard Implementation
   private ArrayList<CreditCardInfo> creditCards;
   
   //TODO: Check this
   public static boolean findLoginInfo(){
      return false;
   }
   
   private static Database single_instance = null;
   


   // static method to create instance of Singleton class
    public static Database getInstance() {
        if (single_instance == null)
            single_instance = new Database();

        return single_instance;
    }
    

   //TODO: was changeStatus(String Username, boolean newStatus)
   public void changeStatus(Player player, boolean newStatus) {
      //Checks is the player is in the database
      if (contains(player))
      player.setLOStatus(newStatus);
   }
   
   public boolean addUser(User newUser){
      if (super.contains(newUser)){
         return false;
      }
         super.add(newUser);
      return true;
   }
   
   //TODO: was retrievePlayerInfo
   public User retrieveUserInfo(String Username){
      for (User user: this){
         if (user.getUsername().toLowerCase().equals(Username.toLowerCase())){
            return  user;
         }
      }
      return null;
   }
   
   @Override
   public boolean contains(Object o) {
      if (o instanceof Player || o instanceof Advertiser || o instanceof GameDeveloper) {
         for (User user : Main.UserDatabase){
            if (user.getUsername().equals(((User)o).getUsername()) && user.getPassword().equals(((User)o).getPassword())){
               return true;
            }
         }
      }
      return false;
   }
}
