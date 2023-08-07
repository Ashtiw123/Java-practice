package myPracticeTab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Programme10Stations {
    static char ans;

    public static void main(String[] args) throws IOException {
        station();
    }

    public static void station() throws IOException {
        do {
            HashMap<String, String> station = new HashMap<>();
            station.put("aldgate", "metropolitan,circle");
            station.put("aldgate east", "district,hammersmith & city");
            station.put("angel", "northern");
            station.put("baker street", "bakerloo,circle,hammersmith & city,jubilee,metropolitan");
            station.put("bank", "central,dlr,northern,waterloo & city");
            station.put("barbican", "metropolitan,circle,hammersmith & city");
            station.put("battersea power station", "northern");
            station.put("bayswater", "district,circle");
            station.put("blackfriars", "circle,district");
            station.put("bond street", "central,jubilee");
            station.put("borough", "northern");
            station.put("cannon street", "circle,district");
            station.put("chancery lane", "central");
            station.put("charing cross", "bakerloo,northern");
            station.put("covent garden", "piccadilly");
            station.put("earl's court", "district,piccadilly");
            station.put("edgware road (bakerloo)", "bakerloo");
            station.put("edgware road (circle)", "circle,district,hammersmith & qty");
            station.put("elephant & castle", "bakerloo,northern");
            station.put("embankment", "bakerloo,circle,district,northern");
            station.put("euston", "northern,victoria");
            station.put("euston square", "metropolitan,circle,hammersmith & city");
            station.put("gloucester road", "circle,district,piccadilly");
            station.put("goodge street", "northern");
            station.put("great portland street", "metropolitan,circle,hammersmith & city");
            station.put("farringdon", "circle,hammersmith & city,metropolitan");
            station.put("green park", "jubilee,piccadilly,victoria");


            BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter station name: ");
            String name = st.readLine().toLowerCase(Locale.ROOT);
            if (station.containsKey(name)) {
                System.out.print("Lines pass through " + name + " station :");
                System.out.println(station.get(name));
            } else {
                System.out.println("Entered station is not in zone 1 or is not between a and g");
            }
            System.out.println("Would you like to check another station: Yes or No? ");
            Scanner scanner = new Scanner(System.in);
            ans = scanner.next().toLowerCase().charAt(0);
        } while (ans == 'y');
    }
}

