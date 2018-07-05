import java.util.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.file.*;
import java.io.*;
public class Tutorial1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("contractors.txt"));
            while (true) {
                String name = br.readLine();
                if (name.contains("Robin") && name.contains("Morris")) {
                    System.out.println(name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}