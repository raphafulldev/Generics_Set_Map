package exercicioResolvidoSet.application;

import exercicioResolvidoSet.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

import static java.lang.System.in;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();

            while (line != null){
                String [] fields = line.split(" ");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(userName, moment));
                line = br.readLine();
            }

            System.out.print("Total users: "  + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
