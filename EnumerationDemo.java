
import java.io.*;
public class EnumerationDemo {
    public enum Dayofweek{
         Monday(1),Tuesday(2),wednesday(3),Thursday(4),Friday(5),Saturday(6),Sunday(7);
         public int val;
         Dayofweek(int val){
             this.val=val;
         }
         boolean isWorkday(){
             if(val<6)
             return true;
             else
             return false;
         }
         }
         public static void main(String[] args){
            Dayofweek day;
            System.out.println("Verification of sunday(isworkday()");
            System.out.println(Dayofweek.Sunday.isWorkday());
            System.out.println("Verification of Wednesday(isWorkday()");
            System.out.println(Dayofweek.wednesday.isWorkday());
         }
     }
 
 