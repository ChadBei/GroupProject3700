package ObjectClasses;

import java.util.Date;

public class TournamentInfo {
   
   private  int numOfPlayers;
   private  int numOfMatches;
   private String style;
   private Date startDate;
   private String description;
   
   //TODO: private Advertiser Sponsor
   
   public TournamentInfo(int numOfPlayers, int numOfMatches, Date startDate, String description) {
      this.numOfPlayers = numOfPlayers;
      this.numOfMatches = numOfMatches;
      this.startDate = startDate;
      this.description = description;
   }
   
   public TournamentInfo() {
   }
   
   public String getStyle() {
      return style;
   }
   
   public void setStyle(String style) {
      this.style = style;
   }
   
   public int getNumOfPlayers() {
      return numOfPlayers;
   }
   
   public int getNumOfMatches() {
      return numOfMatches;
   }
   
   public Date getStartDate() {
      return startDate;
   }
   
   public String getDescription() {
      return description;
   }
   
   public void setNumOfPlayers(int numOfPlayers) {
      this.numOfPlayers = numOfPlayers;
   }
   
   public void setNumOfMatches(int numOfMatches) {
      this.numOfMatches = numOfMatches;
   }
   
   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }
   
   public void setDescription(String description) {
      this.description = description;
   }
   
   
}
