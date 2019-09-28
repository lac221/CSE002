import java.util.Random;
import java.util.Scanner;// imports Scanner in order to have users input values
public class Methods{
    public static void main (String[]args)
    {
        System.out.print("The "+ Adjective() + Adjective() + Subject() + Verb() + "the " + Adjective() + Subject2()); 
    }
    
    public static String Adjective()
    {
        int adjective = (int)(Math.random()*10);
        switch (adjective)
        {
            case 0:
                return "quick ";
            case 1:
                return "fast ";
            case 2:
                return "slow ";
            case 3:
                return "speedy ";
            case 4:
                return "boring ";
            case 5:
                return "crazy ";
            case 6:
                return "hot ";
            case 7:
                return "SUPER ";
            case 8:
                return "funny ";
            case 9:
                return "sad ";
        }
        return "";
    }
    public static String Subject()
    {
        int subject = (int)(Math.random()*10);
        switch (subject)
        {
            case 0:
                return "dog ";
            case 1:
                return "fox ";
            case 2:
                return "pirate ";
            case 3:
                return "girl ";
            case 4:
                return "dealer ";
            case 5:
                return "teacher ";
            case 6:
                return "student ";
            case 7:
                return "cat ";
            case 8:
                return "ninja ";
            case 9:
                return "squirrel ";
        }
        return "";
    }
    public static String Verb()
    {
        int verb = (int)(Math.random()*10);
        switch (verb)
        {
            case 0:
                return "ran ";
            case 1:
                return "jumped ";
            case 2:
                return "killed ";
            case 3:
                return "dealt ";
            case 4:
                return "taught ";
            case 5:
                return "ignored ";
            case 6:
                return "annoyed ";
            case 7:
                return "loved ";
            case 8:
                return "hated ";
            case 9:
                return "helped ";
        }
        return "";
    }
    public static String Subject2()
    {
        int subject2 = (int)(Math.random()*10);
        switch (subject2)
        {
            case 0:
                return "dog ";
            case 1:
                return "fox ";
            case 2:
                return "pirate ";
            case 3:
                return "girl ";
            case 4:
                return "dealer ";
            case 5:
                return "teacher ";
            case 6:
                return "student ";
            case 7:
                return "cat ";
            case 8:
                return "ninja ";
            case 9:
                return "squirrel ";
        }
        return "";
    }
}