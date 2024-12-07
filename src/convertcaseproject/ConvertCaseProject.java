/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertcaseproject;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class ConvertCaseProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner convert = new Scanner (System.in);

        //user imput and try to seperate it
        System.out.print("Please enter a word:");
        String word = convert.nextLine();

        //text box (IDE's suggestion)
        System.out.print("""
                         please choose the case you want to convert too 
                          1.'l' or 'L' for lowercase: 
                          2.'u'or 'U' for uppercase 
                          3. 't' or 'T' for titlecase 
                         """);
        String Case = convert.nextLine();
        //convert the string to character
        char theCase= Case.charAt(0);
        //convert the char to uppercase
        char CaseType = Character.toUpperCase(theCase);


        //calling the methods
        String CallingCase1 = ConvertCase(word);
        String CallingCase2 = ConvertCase(word, CaseType);
        //to allign more easily make a colon string
        String colonStr =":";

        //Print the result
        System.out.printf("Original word %26s %s \n",colonStr,word);
        System.out.printf("Calling the first ConvertCase method   %s %s \n",colonStr, CallingCase1);
        System.out.printf("Calling the second ConvertCase method  %s %s \n",colonStr,CallingCase2);

    }
    //making the different methods
    //toTitleCase
    public static String ConvertCase(String word){
        String TitleCase = ToTitleCase(word);
        return TitleCase;
    }
    //toUpperCase
    public static String ConvertCase(String word, char caseType) {


        switch(caseType){
            case 'U':
                return word.toUpperCase();

            case 'L':
                return word.toLowerCase();

            case 'T':
                return (ToTitleCase(word));

            default:
                return "wrong imput";

        }
    }
    //method to convert to TitleCase
    public static String ToTitleCase (String word){
        String firstletter = word.substring(0,1);
        String theRest = word.substring (1);

        firstletter = firstletter.toUpperCase();
        theRest = theRest.toLowerCase();
        String Thetitlecase = firstletter+theRest;
        return Thetitlecase;
    }
}







