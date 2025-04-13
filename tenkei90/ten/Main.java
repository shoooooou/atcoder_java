package tenkei90.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] parts = reader.readLine().split(" ");
    int n = Integer.parseInt(parts[0]);
    int[] a = new int[n + 1];
    int[] b = new int[n + 1];
    for (int i = 0; i < n; i++) {
      String[] line = reader.readLine().split(" ");
      if ("1".equals(line[0])) {
        a[i + 1] = a[i] + Integer.parseInt(line[1]);
        b[i + 1] += b[i];
      } else {
        b[i + 1] = b[i] + Integer.parseInt(line[1]);
        a[i + 1] += a[i];
      }
    }
    String calcCnt = reader.readLine().split(" ")[0];
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < Integer.parseInt(calcCnt); i++) {
      String[] lines = reader.readLine().split(" ");
      int start = Integer.parseInt(lines[0]);
      int end = Integer.parseInt(lines[1]);
      answer.append(a[end] - a[start - 1]);
      answer.append(" ");
      answer.append(b[end] - b[start - 1]);
      answer.append("\n");
    }
    System.out.print(answer);
  }
}
