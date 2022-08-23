package com.data.junit.inter1;

/*import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;*/

public class Java11Demo {

    public static void main(String[] args) {
        /*// new method in string class : isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
        String multilineString = "Jk helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        System.out.println(lines.toString());

        //


        *//*Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);*//*


        // java.util.Collection interface contains a new default toArray method which takes an IntFunction argument
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
        Arrays.stream(sampleArray).forEach(p-> System.out.println(p));


        //  not method has been added to the Predicate interface. We can use it to negate an existing predicate, much like the negate method
        List<String> sampleList1 = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList1.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        withoutBlanks.stream().forEach(p -> System.out.println(p));


        //the local variable syntax (var keyword) in lambda parameters was added in Java 11.
        List<String> sampleList2 = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList2.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(resultString);


        // we don't need to compile the Java source files with javac explicitly anymore:
        *//*
            $ java HelloWorld.java
            Hello Java 11!
         */


    }
}
