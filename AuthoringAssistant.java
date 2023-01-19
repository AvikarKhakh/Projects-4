import java.io.*; // imported many classes in order for the code to work properly
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AuthoringAssistant {
        public static Scanner scnr = new Scanner(System.in); // creates a scanner method

        private static char inputFromConsole() {
            System.out.println("WELCOME TO AUTHORING ASSISTANT =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("================= MENU ================");
            System.out.println("(i) Input from console");
            System.out.println("(1) Load from file");
            System.out.println("(c) Number of non-whitespace characters");
            System.out.println("(w) Number of words");
            System.out.println("(f) Find text");
            System.out.println("(r) Replace all");
            System.out.println("(s) Save to a file");
            System.out.println("(q) Quit");

            System.out.print("Choose an option: ");

            char inputOption = scnr.nextLine().charAt(0);

            return inputOption;
        } // prints menu screen and asks user to give an option through a character.

        private static String loadFromFile(String filename) throws IOException {
            Path path = Paths.get(filename); // creates a path object
            Scanner s = new Scanner(path); // uses scanner to get path
            String inputString = null; // initializes inputString
            while (s.hasNextLine()) { // takes scanner and puts it into inputString
                inputString = s.nextLine();
            }
            s.close(); // closes scanner
            return inputString;
        }

        private static int countCharacters (String inputString) {
            inputString = inputString.trim().replaceAll("\\s", ""); // \\s looks for spaces and then replaces them with a backspace and then provides the length of the string
            return inputString.length();
        }

        private static int countWords (String inputString) {
            String[] numWords = inputString.split("\\s+");  // \\s+ breaks the string into separate arrays of substrings
            return numWords.length; // the spaces in the code are removed and then the words are counted
        }

        private static int findText (String find, String inputString) {
            int lastIndex = 0; // initialize two variables to 0
            int toFindCount = 0;

            while (lastIndex != -1) { // the while continues to run until the last index value is not equal to -1
                lastIndex = inputString.indexOf(find, lastIndex);

                if (lastIndex != -1) { // each time the index value is not -1 it will add to the value toFindCount
                    toFindCount++;
                        lastIndex += find.length(); // adds the last index with the length of the word
                }
            }
            return toFindCount;
        }

        private static String replaceAll(char toReplace, char replaceWith, String inputString) {
            String newString1 = inputString.replace(toReplace, replaceWith); // replaces character with a character
            return newString1;
        }

        private static void save(String filename, String inputString) throws IOException {
            FileOutputStream fos = null; //initialize object
            try { // opened file and write input string
                fos = new FileOutputStream(filename);
                fos.write(inputString.getBytes("UTF-8")); // text file can only be edited be through bytes
            } catch (IOException e) { // closes the file
                close(fos);
                throw e; // throw ioException, compiler doesn't stop working
            }
        }

        private static String readFile(String filename) throws IOException {
            File file = new File(filename); // create file object
            int size = (int) file.length(); // size of file
            byte[] bytes = new byte[size]; // converts size of file to bytes
            FileInputStream fis = null; // initialize fileinputstream

            try { // another try and catch to open and read file
                fis = new FileInputStream(file);
                assert size == fis.read(bytes);
            } catch (IOException e) { // closes file
                close(fis);
                throw e; // throws exception
            }
            return new String(bytes, "UTF-8");  // returns string
        }
        private static void close(Closeable closeable){
            try { // closes file completely
                closeable.close();
            } catch (IOException ignored) {

            }
        }

        public static void main(String[] args) throws IOException { // main method
            String inputString = "";  // initialize all the variables
            String find;
            String newString1;
            String filename = "";
            char toReplace;
            char replaceWith;
            int numNonWSChar;
            int numWords;
            int toFindCount;

            char inputOption = inputFromConsole();

            if (inputOption != '1' && inputOption != 'i') {
                System.out.println("You must provide input text first!");
                inputOption = inputFromConsole();
            } // keep asking user for a proper input

            while (inputOption != '1' && inputOption != 'i')
            {
                System.out.print("Choose an option: ");
                inputOption = scnr.nextLine().charAt(0);

                if (inputOption != '1' && inputOption != 'i')
                {
                    System.out.print("Choose an option: ");
                    inputOption = scnr.nextLine().charAt(0);
                }
            }

            while (true) { // while loop that controls the code and assigns the input string to different methods above.

                if (inputOption == 'i')
                {
                    System.out.println("Manually enter your text below: ");
                    inputString = scnr.nextLine();
                    System.out.println("You entered: ");
                    System.out.println(inputString);
                }
                else if (inputOption == 'c')
                {
                    numNonWSChar = countCharacters(inputString);
                    System.out.println("Number of non-whitespace character: " + numNonWSChar);
                }
                else if (inputOption == 'w')
                {
                    numWords = countWords(inputString);
                    System.out.println("Number of words: " + numWords);
                }
                else if (inputOption == 'f')
                {
                    System.out.print("Enter the target text to find: ");
                    find = scnr.nextLine();
                    toFindCount = findText(find, inputString);
                    System.out.println("\"" + find + "\" occurs " + toFindCount + " times");
                }
                else if (inputOption == 'r') {
                    System.out.print("Enter the character to be replaced: ");
                    toReplace = scnr.nextLine().charAt(0);
                    System.out.print("Enter the replacement character: ");
                    replaceWith = scnr.nextLine().charAt(0);
                    newString1 = replaceAll(toReplace, replaceWith, inputString);
                    System.out.println("After replacing " + toReplace + " with " + replaceWith + ", the new text is: ");
                    System.out.println(newString1);
                }
                else if (inputOption == '1') {
                    System.out.print("Path to the file: ");
                    filename = scnr.nextLine();
                    inputString = loadFromFile(filename);
                    System.out.println("File " + filename + " contains the text: ");
                    System.out.println(inputString);
                }
                else if (inputOption == 's') {
                    System.out.print("Path to the file to save: ");
                    filename = scnr.nextLine();
                    save(filename, inputString);
                    System.out.println("File " + filename + " is successfully saved!");
                }
                else // if user puts q the program will quit
                {
                    return;
                }

                inputOption = inputFromConsole(); // at the end of the loop asks user again for input option
            }

        }
    }










