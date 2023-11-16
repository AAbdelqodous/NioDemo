package io;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        /*
          ------ Low-Level Stream -------
          FileOutputStream
          FileInputStream
          ------ High-Level Stream -------
          BufferedWriter
          BufferedReader
          *--------------------
          PrintStream => System.out, System.err
          PrintWriter => System.in
          **/

        try(
                Writer fw = new FileWriter("file1.txt");
                BufferedWriter bw = new BufferedWriter(fw)
        ){
            bw.write("Welcome to file writer...");System.console();
//            bw.flush(); // you need if you don't use a try with resources
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
