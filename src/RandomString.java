import java.io.FileWriter;
import java.io.IOException;
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
            FileWriter MyWriter;
            try {
                MyWriter = new FileWriter("C:\\Users\\HP\\IdeaProjects\\StringTask\\output1.txt");

                for(int i = 1; i <= number; i++ ) {

                    //System.out.println(randomString
                           // .getAlphaNumericString(count));


                    MyWriter.write(i+"  " + randomString.getAlphaNumericString(count) + "\n");

                }
                System.out.println("file has been created on given number of lines");
                MyWriter.close();
            } catch (IOException e) {

                e.printStackTrace();
            }



        }
        else {
            System.out.println("enter a number between 1 and 230");
        }
    }




}

