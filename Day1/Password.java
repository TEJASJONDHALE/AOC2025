// import java.util.*;
// import java.io.*;
// public class Password {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//         int dial = 50;
//         int count = 0;
//         String line = "";
//         while ((line = br.readLine()) != null) {
//             char dir = line.charAt(0);
//             int dis = Integer.parseInt(line.substring(1));
//             if (dir == 'L') {
//                 dial = (dial - dis) % 100;
//                 if (dial < 0) {
//                     dial += 100;
//                 }
//             } else {
//                 dial = (dial + dis) % 100;
//             }
//             if (dial == 0 ) {
//                 count++;
//             }
//         }
//         br.close();
//         System.out.println(count);
//     }
// }

import java.util.*;
import java.io.*;
public class Password {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int dial = 50;
        int count = 0;
        String line = "";
        while ((line = br.readLine()) != null) {
            char dir = line.charAt(0);
            int dis = Integer.parseInt(line.substring(1));
            for (int i = 0; i < dis; i++) {
                if (dir == 'L') {
                    dial--;
                    if (dial < 0) {
                        dial = 99;
                    }
                } else {
                    dial++;
                    if (dial > 99) {
                        dial = 0;
                    }
                }
                if (dial == 0) {
                    count++;
                }
            }
        }
        br.close();

        System.out.println(count);
    }
}
