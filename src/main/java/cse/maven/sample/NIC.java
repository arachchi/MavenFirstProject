/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cse.maven.sample;

/**
 *
 * @author Nuran Arachchi
 */
public class NIC {
   public  String year,gender;
   public boolean isVoter;
   public int month,days,recodeSetNo;

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param isVoter the isVoter to set
     */
    public void setIsVoter(boolean isVoter) {
        this.isVoter = isVoter;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @param days the days to set
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * @param recodeSetNo the recodeSetNo to set
     */
    public void setRecodeSetNo(int recodeSetNo) {
        this.recodeSetNo = recodeSetNo;
    }



}
