/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cse.maven.sample;
import org.joda.time.DateTime;
import cse.maven.sample.exception.InvalidInput;
/**
 *
 * @author Nuran Arachchi
 */
public class NICcode {
    String id;
   public int days,year,month,date;

    public NICcode(String id) throws InvalidInput{
         this.id=id;
         if(id.length()!=10)
             throw new InvalidInput();

         String day=id.substring(2,5);
         days=Integer.parseInt(day);
    }
    public void birthDate(){
        String year1=id.substring(0, 2);
        year=Integer.parseInt("19"+year1);

        DateTime d2=new DateTime(year,1,1,0,0);
        DateTime d3;
        if(year%4==0)
        d3=d2.plusDays(days-1);
        else
        d3=d2.plusDays(days-2);

        month=d3.getMonthOfYear();
        date=d3.getDayOfMonth();

    }
    public String gender(){
        if(days<500) return "MALE";
        else return "FEMALE";
    }

    public boolean isvoter(){
            boolean isVoter; 
            if(new DateTime().getYear() - year>=18)
                isVoter = true;
            else
                isVoter = false;
            return isVoter;
    }
    public NIC set(){
        NIC user=new NIC();

        user.setGender(gender());
        birthDate();
        user.setYear(Integer.toString(year));
        user.setMonth(month);
        user.setDays(date);
        user.setIsVoter(isvoter());

        return user;
    }


}
