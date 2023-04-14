import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Days ras=Days.valueOf(scanner.nextLine().toUpperCase());
        switch (ras){
            case MONDAY -> System.out.println(Days.MONDAY);
            case TUESDAY -> System.out.println(Days.TUESDAY);
            case THURSDAY -> System.out.println(Days.THURSDAY);
            case WEDNESDAY -> System.out.println(Days.WEDNESDAY);
            case FRIDAY -> System.out.println(Days.FRIDAY);
            case SATURDAY -> System.out.println(Days.SATURDAY);
            case SUNDAY -> System.out.println(Days.SUNDAY);
        }
    }
}