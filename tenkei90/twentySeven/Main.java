package tenkei90.twentySeven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(reader.readLine());
    Set<String> users = new HashSet<>();
    for (int i = 0; i < num; i++) {
      String user = reader.readLine();
      if (users.contains(user)) {
        continue;
      }
      users.add(user);
      System.out.println(i + 1);
    }
  }
}
