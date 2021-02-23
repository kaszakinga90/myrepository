package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String text1 = poemBeautifier.beautify("Mój tekst do ozdobienia", text -> text+"ABC");
        System.out.println(text1);

        String text2 = poemBeautifier.beautify("Mój tekst do ozdobienia", text -> text.concat("abc"));
        System.out.println(text2);

        String text3 = poemBeautifier.beautify("Mój tekst do ozdobienia", text -> text.toUpperCase(Locale.ROOT));
        System.out.println(text3);

        String text4 = poemBeautifier.beautify("Mój tekst do ozdobienia", text -> text.replace("o", "DOGandCAT"));
        System.out.println(text4);


    }
}
