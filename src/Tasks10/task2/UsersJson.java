package Tasks10.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersJson {

    public static void main(String[] args) {
        String inputFilePath ="user.txt";
        String outputFilePath = "user.json";

        List<User> userList = readUsersFromFile(inputFilePath);
        writeUsersToJsonFile(userList, outputFilePath);
    }
    public static List<User> readUsersFromFile(String filePath){
        List<User> userList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine();

            String line;
            while ((line =br.readLine()) != null){
                String[] values = line.split(" ");
                if(values.length ==2){
                    String name = values[0];
                    String age = values[1];

                    User user = new User(name,age);
                    userList.add(user);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return userList;
    }
    public static void writeUsersToJsonFile(List<User> userList, String filePath){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter fileWriter = new FileWriter(filePath)){
            gson.toJson(userList, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
