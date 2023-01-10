import java.util.ArrayList;

public class DoubleHashing {
    String[] hashTable;
    int usedCellNumber;

    // Constructor
    DoubleHashing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    // HashFunction to be used on keys
    public int modASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    public void rehashKeys(String newStringToBeInserted) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null)
                data.add(s);
        }
        data.add(newStringToBeInserted);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            insertKeyInHashTable(s);
        }
    }

    // Display the hash table
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("\nHashTable does not exists !");
            return;
        } else {
            System.out.println("\n--------HashTable-----------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index: " + i + ", key: " + hashTable[i]);
            }
        }
        System.out.println("\n");
    }

    public int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value += sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    public int secondHashFuncion(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int sum, i;
        for (i = 0, sum = 0; i < x.length(); i++) {
            sum += ch[i];
        }
        while (sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }
        return sum % M;
    }

    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75)
            rehashKeys(value);
        else {
            int x = modASCIIHashFunction(value, hashTable.length);
            int y = secondHashFuncion(value, hashTable.length);
            for (int i = 0; i < hashTable.length; i++) {
                int newIndex = (x + i * y) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = value;
                    System.out.println(value + " inserted at location: " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is occupied. Trying next empty index...");
                }
            }
        }
        usedCellNumber++;
    }
}
