/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cse.maven.sample.exception;

/**
 *
 * @author Nuran Arachchi
 */
public class InvalidInput extends Exception{
    public InvalidInput(){
        super("Invalid Input. Check the input");
    }
}
