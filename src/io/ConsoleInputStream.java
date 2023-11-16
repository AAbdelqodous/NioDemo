package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputStream {
    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // BufferedReader uses InputStreamReader to read from a Low-level Stream

        try {
            String line = br.readLine();
            System.out.println("you entered: " +line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
                isr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
