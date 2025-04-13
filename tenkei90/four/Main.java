package tenkei90.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] parts = reader.readLine().split(" ");
    int h = Integer.parseInt(parts[0]);
    int w = Integer.parseInt(parts[1]);
    int[][] a = new int[h][w];
    int[] rowsum = new int[h];
    int[] colsum = new int[w];

    for (int i = 0; i < h; i++) {
      String[] line = reader.readLine().split(" ");
      for (int j = 0; j < w; j++) {
        a[i][j] = Integer.parseInt(line[j]);
        rowsum[i] += a[i][j];
        colsum[j] += a[i][j];
      }
    }

    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        answer.append(rowsum[i] + colsum[j] - a[i][j]);
        if (j < w - 1) {
          answer.append(" ");
        }
      }
      answer.append("\n");
    }
    System.out.print(answer);
  }
}
