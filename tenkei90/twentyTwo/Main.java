package tenkei90.twentyTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] parts = reader.readLine().split(" ");
    long[] partsLong = Arrays.stream(parts).mapToLong(Long::parseLong).toArray();
    long gcdNum = gcd(gcd(partsLong[0], partsLong[1]), partsLong[2]);

    System.out.print(Arrays.stream(partsLong).map(part -> part / gcdNum - 1).sum());
  }

  private static long gcd(long a, long b) {
    while (b != 0) {
      long temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
