package org.practice;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicateInString {

    public static void main(String[] args) {

      try {
          boolean sdfsd = hasDuplicate("sdfsd");
          System.out.println(sdfsd);
      }finally {
          System.out.println(hasDuplicate("sdsdf"));
      }

    }

    public static boolean hasDuplicate(String input) {
        List<Character> collect = input.chars()
                .mapToObj(c -> (char) c)
                .distinct().collect(Collectors.toList());

        return collect.size() != input.length();
    }
}
