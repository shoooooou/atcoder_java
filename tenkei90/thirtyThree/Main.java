package tenkei90.thirtyThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] parts = reader.readLine().split(" ");
    int h = Integer.parseInt(parts[0]);
    int w = Integer.parseInt(parts[1]);
    if (h == 1 || w == 1) {
      System.out.println(h * w);
      return;
    }

    System.out.println(((w + 1) / 2) * ((h + 1) / 2));
  }
}
