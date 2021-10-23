

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class RandomString {

    // function to generate a random string of length n
    public  String getAlphaNumericString(int n)	{


        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";


        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }


    public void lineGenerator(RandomString randomString) {


        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        int count = 100;
        if(number >0 && number <230) {


            try {

                PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
                for(int i = 1; i <= number; i++ ) {

                    pw.println(i+"  " + randomString.getAlphaNumericString(count) + "\n");

                }

                pw.close();
                System.out.println("lines are created in output file");
            } catch (IOException e) {

                e.printStackTrace();
            }



        }
        else {
            System.out.println("enter a number between 1 and 230");
        }
    }




}
