package myPracticeTab2;

import java.util.HashMap;
import java.util.Scanner;

/*
10. Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.

 */
public class Prog10Zone1StationsWhichLinePasses {

    public static void main(String[] args) {

        // create a new HashMap that maps station names to tube lines
        HashMap<String, String> tubeLines = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter station name: ");
        String a = scanner.next();
        // add some entries to the HashMap for Zone 1 stations
        tubeLines.put("Angel", "Northern Line");
        tubeLines.put("Bank", "Central Line");
        tubeLines.put("Charing Cross", "Bakerloo Line");
        tubeLines.put("Covent Garden", "Piccadilly Line");
        tubeLines.put("Embankment", "District Line");
        tubeLines.put("Euston", "Northern Line");
        tubeLines.put("Green Park", "Jubilee Line");
        tubeLines.put("Holborn", "Central Line");
        tubeLines.put("King's Cross St Pancras", "Northern Line");
        tubeLines.put("Leicester Square", "Piccadilly Line");
        tubeLines.put("Liverpool Street", "Central Line");
        tubeLines.put("London Bridge", "Northern Line");
        tubeLines.put("Moorgate", "Northern Line");
        tubeLines.put("Oxford Circus", "Bakerloo Line");
        tubeLines.put("Piccadilly Circus", "Piccadilly Line");
        tubeLines.put("Tottenham Court Road", "Central Line");
        tubeLines.put("Victoria", "Victoria Line");
        tubeLines.put("Waterloo", "Bakerloo Line");

        // specify the stations you're interested in
        String station1 = "";
        String station2 = "";

        // check which tube line(s) pass through the specified stations
        String line1 = tubeLines.get(station1);
        String line2 = tubeLines.get(station2);

        // print out the results
        if (line1 != null && line2 != null) {
            if (line1.equals(line2)) {
                System.out.println("Both stations are on the " + line1 + " .");
            } else {
                System.out.println("Station 1 is on the " + line1 + " line, and Station 2 is on the " + line2 + " line.");
            }
        } else {
            System.out.println("One or both of the specified stations is not in Zone 1, or is not a valid station name.");
        }
    }
}
