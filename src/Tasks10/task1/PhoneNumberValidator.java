package Tasks10.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberValidator {
    public static void main(String[] args) {
     String filePath = "file.txt";

     try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
         String line;
         while ((line = br.readLine()) != null){
             if(isValidPhoneNumber(line)){
                 System.out.println(line);
             }
         }
     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String pattern1 = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        String pattern2 = "\\d{3}-\\d{3}-\\d{4}";

       return phoneNumber.matches(pattern1) | phoneNumber.matches(pattern2);
    }
}
