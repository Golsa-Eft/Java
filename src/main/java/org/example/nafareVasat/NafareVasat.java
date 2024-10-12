package org.example.nafareVasat;

import java.util.ArrayList;
import java.util.Scanner;

public class NafareVasat {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String[] inputParts = scanner.nextLine().split(" ");
            String person = inputParts[0];
            String position = inputParts[1];

            if ("L".equals(position)) {
                persons.add(0, person);
            } else if ("R".equals(position)) {
                persons.add(person);
            }
        }

        System.out.println(persons.get(1));
    }
}
