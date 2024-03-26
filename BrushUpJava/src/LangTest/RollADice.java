package LangTest;

import java.security.SecureRandom;
import java.util.Scanner;

public class RollADice {

    public void rollADice()
    {
        SecureRandom secureRandom = new SecureRandom();
        for(int i = 1; i <= 20; i++)
        {
            int selectedNumber = secureRandom.nextInt(6) + 1;
            System.out.printf("%d ",selectedNumber);
            if(i % 5 == 0){
                System.out.println();
            }

        }
    }

    public void rollADice6MTimes(){
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        SecureRandom secureRandom = new SecureRandom();

        for(int i = 1; i <= 60000000; i++)
        {
            int face = 1 + secureRandom.nextInt(6);
            switch (face){
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }
        }

        System.out.println("Face           Frequency");
        System.out.println("1              " + one);
        System.out.println("2              " + two);
        System.out.println("3              " + three);
        System.out.println("4              " + four);
        System.out.println("5              " + five);
        System.out.println("6              " + six);
    }
}
