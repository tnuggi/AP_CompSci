package funWithStrings;

import java.io.*;

public class PrintFileInfo {

    private String fileName;
    private File file;
    private int numLine;
    private int charCount;
    private int wordCount;
    private static int numLineSum;
    private static int charCountSum;
    private static int wordCountSum;
    private static boolean hasBeenReturned = false;
    private BufferedReader br;
    public PrintFileInfo(String fn){
        fileName = fn;
        file = new File(fn);
    }
    public String printFileInfoInit(){
        String st ;
        String str = "";
        try {
            br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null){
                str+=st;
                str+="\n";
                numLine++;
                charCount+=st.length();
                for(int i =0; i<st.length(); i++){
                    if(isSpace(st.charAt(i))){
                        wordCount++;
                    }
                }
                if(!st.isEmpty()){
                    wordCount++;
                } else {
                    wordCount-=2;
                }
            }
            numLineSum += numLine;
            charCountSum += charCount;
            wordCountSum += wordCount;
        } catch (FileNotFoundException e) {
            hasBeenReturned = true;
            return toPrintTotalFileInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toPrintFileInfo();
    }
    private String toPrintFileInfo(){
        String toReturn = "";
        toReturn += "__________________________________\n";
        toReturn += "\nFile Name: " + fileName;
        toReturn += "\nNumber of lines: " + numLine;
        toReturn += "\nNumber of characters: " + charCount;
        toReturn += "\nNumber of words: " + wordCount;
        toReturn += "\n__________________________________\n";
        return toReturn;
    }
    public String toString(){
        return toPrintFileInfo();
    }

    public static String toPrintTotalFileInfo() {
        String toReturn = "";
        toReturn += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        toReturn += "\nTotal num lines: " + numLineSum;
        toReturn += "\nTotal num charecters: " + charCountSum;
        toReturn += "\nTotal num words: " + wordCountSum;
        toReturn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        return toReturn;
    }
    public static boolean isSpace(char c){
        if (c == 32){
            return true;
        }
        return false;
    }
    public static boolean hasBeenReturned(){
        return hasBeenReturned;
    }
}