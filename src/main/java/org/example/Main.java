package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        new BufferedReader(
                new InputStreamReader(classLoader.getResourceAsStream("puzzle_bonus.csv"))
        ).lines()
                .map(x -> x.split(","))
                .collect(Collectors.groupingBy(s -> s[1]))
                .values().stream().filter(s -> s.size() == 2).findFirst().get()
                .forEach(s -> {
            for (String x : s) {
                System.out.println(x);
            }
        });

    }


}

class doStuff {
    public void code() throws IOException {

        //URI uri = classLoader.getResource("puzzle.csv").toURI();

        //Stream<String> lines = Files.lines(Paths.get(uri));
        // getClass().getClassLoader();

        //  InputStream lines = Thread.currentThread().getContextClassLoader().getResourceAsStream("resources/puzzle.csv");

        //  Map<Object, List<String[]>> result = new BufferedReader(new InputStreamReader(lines)).lines().map(x -> x.split(",")).collect(Collectors.groupingBy(s -> s[1]));

        //Map<Object, List<String[]>> linesSplit = lines.map(x -> x.split(",")).collect(Collectors.groupingBy(s -> s[1]));

        //   List<String[]> count = result.values().stream().filter(s -> s.size()==2).findFirst().get();

        //     count.forEach(s -> {
        //       for (String x : s) {
        //         System.out.println(x);
        //   }
        //});

    }

}