import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String a = "Вячеслав";

        System.out.println("Your Name");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();


        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        }
        else {
            System.out.println("Oops");
        }


    }
}
