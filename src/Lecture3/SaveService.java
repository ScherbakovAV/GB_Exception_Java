package Lecture3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SaveService {
//    public void save() throws IOException{
//        System.out.println("Saving document started");
//        try (FileWriter writer = new FileWriter("test2")){
//            throw new IOException("Operation failed");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            throw e;
//        }
    // При использовании своего exception:
    public void save() throws SavedException{
        Date date = new Date();
        System.out.println("Saving document started");
        try (FileWriter writer = new FileWriter("test2")){
            throw new IOException("Operation failed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new SavedException("Saved document failed", date, e);
        }
    }
}
