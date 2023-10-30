package Dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Before formatting: " + current);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDate = current.format(format);
        System.out.println(formatDate);
    }
}
