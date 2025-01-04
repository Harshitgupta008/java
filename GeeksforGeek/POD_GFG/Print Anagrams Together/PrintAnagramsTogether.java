import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// i just trying my own way but some problem are pendding but it works except some case

public class PrintAnagramsTogether {

    static boolean Anagram(String s1, String s2) {
        char cr1[] = s1.toCharArray();
        char cr2[] = s2.toCharArray();
        Arrays.sort(cr1);
        Arrays.sort(cr2);

        return Arrays.equals(cr1, cr2);
    }

    static ArrayList<ArrayList<String>> PrintAnagram(String arr[]) {
        ArrayList<ArrayList<String>> arraylist = new ArrayList<>();
        int end = arr.length;
        HashSet hs1 = new HashSet<>();
        for (int i = 0; i < end - 2; i++) {
            HashSet<String> hs = new HashSet<>();
            for (int j = i + 1; j < end; j++) {
                if (hs1.contains(arr[j])) {
                    continue;
                } else {
                    if (Anagram(arr[i], arr[j])) {
                        hs.add(arr[i]);
                        hs.add(arr[j]);
                        hs1.add(arr[j]);
                    }
                }

            }
            if (hs.size() > 0) {
                ArrayList<String> list1 = new ArrayList<>(hs);
                arraylist.add(list1);
            }
        }

        return arraylist;
    }

    public static void main(String[] args) {
        String arr[] = { "listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art" };
        System.out.println(PrintAnagram(arr));
    }

}
