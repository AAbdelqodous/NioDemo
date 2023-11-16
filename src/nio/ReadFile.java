package nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ReadFile {
    private static final String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
        int vCount = 0;
        try(
                 var br = Files.newBufferedReader( Paths.get("verse.txt"));
        ){
            String line;
            while ((line = br.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {

                    if(vowels.contains(String.valueOf(line.charAt(i)))){
                        vCount++;
                    }
                }
            }
        }catch(Exception e){

        }
        System.out.println(vCount);
    }
}