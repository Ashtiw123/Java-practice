package myPracticeTab;

import java.util.ArrayList;
import java.util.Scanner;

public class Prog10Zone1Station {
    public static void main(String[] args) {
        Prog10Zone1Station obj = new Prog10Zone1Station();
        obj.tubeCrossZone1Station();
    }

    public void tubeCrossZone1Station() {
        ArrayList<String> station = new ArrayList();
        station.add("Oxford Circus");
        station.add("Leicester Square");
        station.add("Green Park");
        station.add("Angel");
        station.add("Bank");
        station.add("Charing Cross");

        ArrayList<String> tube = new ArrayList();
        tube.add("Victoria");
        tube.add("Bakerloo Line");
        tube.add("Central Line");
        tube.add("Bakerloo");
        tube.add("Central");
        tube.add("Jubilee");
        tube.add("Piccadilly");
        tube.add("Northern");
        tube.add("Northern Line");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select Station from zone 1 to check which tube passes through that station");
        System.out.print("Select 1 for Oxford Circus, 2 for Leicester Square, 3 for Green Park, 4 for Angel, 5 for Bank and 6 for Charing Cross: ");
        int station1 = sc.nextInt();

        for (String a : station) {
            if (station1 == 1) {
                System.out.println("Tubes passes through " + station.get(0));
                System.out.println(tube.get(0));
                System.out.println(tube.get(1));
                System.out.println(tube.get(2));
                break;
            } else if (station1 == 2) {
                System.out.println("Tubes passes through " + station.get(1));
                System.out.println(tube.get(4));
                System.out.println(tube.get(5));
                break;
            } else if (station1 == 3) {
                System.out.println("Tubes passes through " + station.get(2));
                System.out.println(tube.get(0));
                System.out.println(tube.get(3));
                System.out.println(tube.get(4));
                break;
            } else {
                System.out.println("Select valid station from given list");
                break;
            }
        }
    }
}
