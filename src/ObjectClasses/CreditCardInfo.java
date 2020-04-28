package ObjectClasses;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Date;

public class CreditCardInfo {
   private Date date;
   private int cardNum;
   private short pin;
   
   public CreditCardInfo(int CCNum, short Pin, Date cardDate){
      date = cardDate;
      cardNum = Pin;
      pin = Pin;
      
   }
}
