package myPracticeTab.hashmapandhashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {



        public static void main(String[] args) {

            // Creating a HashMap
            Map<String, String> hashMap = new java.util.HashMap<>();

            // Adding key-value pairs to the HashMap
            hashMap.put("key1", "value1");
            hashMap.put("key2", "value2");
            hashMap.put(null, "value3"); // Allowed in HashMap
            hashMap.put("key4", null); // Allowed in HashMap

            // Creating a HashTable
            Map<String, String> hashTable = new Hashtable<>();

            // Adding key-value pairs to the HashTable
            hashTable.put("key1", "value1");
            hashTable.put("key2", "value2");

            // This will throw a NullPointerException because null keys are not allowed
            // hashTable.put(null, "value3");

            // This will throw a NullPointerException because null values are not allowed
            // hashTable.put("key4", null);

            // Retrieving values from the HashMap and HashTable
            System.out.println("HashMap value for key1: " + hashMap.get("key1"));
            System.out.println("HashTable value for key1: " + hashTable.get("key1"));

            // Iterating over the elements in the HashMap
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            // Iterating over the elements in the HashTable
            for (Map.Entry<String, String> entry : hashTable.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }


