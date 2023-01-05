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

}
