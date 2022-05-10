import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class MultiplicationPyramid {
    private static final String fileName = "inputFile.txt";

    public static void main(String[]args){
        var dataFromFile = getIntFromFile();
        if(dataFromFile == null || dataFromFile.isEmpty()) {
            var input =getInput();
            printPyramid(input);
            saveToFile(input);
            return;
        }

        Scanner scanMultiplyUpTo = new Scanner(System.in);
        char yesNoAnswer;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Do you want to use the last used integer (" + dataFromFile + ") or change? Y/N");
                yesNoAnswer = scanMultiplyUpTo.next().toUpperCase().charAt(0);
                if (yesNoAnswer == 'Y') {
                    printPyramid(Integer.parseInt(dataFromFile));
                    validInput = true;
                } else if (yesNoAnswer == 'N') {
                    var input = getInput();
                    printPyramid(input);
                    saveToFile(input);
                    validInput = true;
                } else
                {
                    System.out.println("Invalid answer! You can only answer 'Y' or 'N'");
                    scanMultiplyUpTo.nextLine();
                }
            }
            catch (Exception e){
                System.out.println("Invalid answer! Error message: " + e);
                scanMultiplyUpTo.nextLine();
            }
        }
    }
    public static int getInput(){
        Scanner scanMultiplyUpTo = new Scanner(System.in);
        int multiplyUpTo = 0;
        boolean validInput = false;

        while (!validInput){
            try{
                System.out.print("Which is the last number that you want to see squared? ");
                multiplyUpTo = scanMultiplyUpTo.nextInt();
                validInput = true;
            }
            catch (Exception e){
                System.out.println("Invalid integer! Error message: " + e);
                scanMultiplyUpTo.nextLine();
            }
        }
        return multiplyUpTo;
    }
    public static void printPyramid(int multiplyUpTo){
        int i; int j;
        for ( i = 1 ; i <= multiplyUpTo; i++ ){
            if (i == 1)
                System.out.print(i);
            else
                System.out.print( i + " ");

            for ( j = i * 2 ; j <= (i*i) ; j += i ){
                if (j != (i*i) )
                    System.out.print(j + " ");
                else
                    System.out.print(j);
            }
            if (i != multiplyUpTo) {
                System.out.println();
            }
        }
    }
    public static String getIntFromFile() {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            var fileData = "";
            while (myReader.hasNextLine()) {
                fileData += myReader.nextLine();
            }

            myReader.close();
            return fileData;
        } catch (FileNotFoundException fex) {
            System.out.println("Could not find file, creating one instead.");
            var file = new File(fileName);
            try
            {
                file.createNewFile();
                getIntFromFile();
            }
            catch(Exception e){
                System.out.println("Could not create the file, something went wrong. " + e);
            }
            return null;
        }
        catch (Exception e) {
            System.out.println("Something went wrong. " + e);
            return null;
        }
    }
    public static void saveToFile(int number) {
        try {
            var writer = new FileWriter(fileName);
            writer.write(Integer.toString(number));
            writer.close();
        } catch (FileNotFoundException fex) {
            var file = new File(fileName);
            try
            {
                file.createNewFile();
                saveToFile(number);
            }
            catch(Exception e){
                System.out.println("Could not create the file, something went wrong. " + e);
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong. " + e);
        }
    }
}
