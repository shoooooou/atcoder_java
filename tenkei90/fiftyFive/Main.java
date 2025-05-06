package tenkei90.fiftyFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] parts = reader.readLine().split(" ");
    int n = Integer.parseInt(parts[0]);
    int p = Integer.parseInt(parts[1]);
    int q = Integer.parseInt(parts[2]);
    String[] aParts = reader.readLine().split(" ");
    int[] a = Arrays.stream(aParts).mapToInt(Integer::parseInt).toArray();
    int cnt = 0;
    for (int i = 0; i < n - 4; i++) {
      for (int j = i + 1; j < n - 3; j++) {
        for (int k = j + 1; k < n - 2; k++) {
          for (int l = k + 1; l < n - 1; l++) {
            for (int m = l + 1; m < n; m++) {
              long multiple = a[i];
              multiple *= a[j];
              multiple %= p;
              multiple *= a[k];
              multiple %= p;
              multiple *= a[l];
              multiple %= p;
              multiple *= a[m];
              multiple %= p;
              if (multiple == q) {
                cnt++;
              }
            }
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
