package Game.Server.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/*
** Creating a rand word by getting a random word from the resource file word.txt
 */


public class Word {

    private static ArrayList<String> lOfWords = new ArrayList<>();

    public static String randomWord(){
        try( Scanner sc = new Scanner(new File("C:\\Users\\Ahmad\\Desktop\\homework1\\Hangman-Game\\res\\words.txt"))) {
            while(sc.hasNext()){
                String str=sc.next();
                lOfWords.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE IO ERROR: " + e.getMessage());
        }
        int index=new Random().nextInt(lOfWords.size());
        return lOfWords.get(index);
    }
}
