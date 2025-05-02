package tenkei90.twentyFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] parts = reader.readLine().split(" ");
    long n = Integer.parseInt(parts[0]);
    long k = Integer.parseInt(parts[1]);
    long[] a = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long[] b = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    long dif = 0;
    for (int i = 0; i < n; i++) {
      dif += Math.abs(a[i] - b[i]);
    }
    if (k < dif || k % 2 != dif % 2) {
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
  }
}
