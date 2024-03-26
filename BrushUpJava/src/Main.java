import Account.Account;
import LangTest.ExceptionOverload;
import LangTest.RollADice;
import LangTest.StaticTest;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try{
           ExceptionOverload.method(null);
           ExceptionOverload.method(0.0);
           ExceptionOverload.method(-5);
       }catch (Exception e)
       {
           System.out.println(e.getMessage());
       }

    }




}