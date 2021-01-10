package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifuler;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.lambda.*;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.person.People;
//import com.kodilla.stream.reference.FunctionalCalculator;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Forum forum = new Forum();

        Map<Integer, ForumUser> theForumUserMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthday().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theForumUserMap.size());
        theForumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        /*BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        /*Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

        /*People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        System.out.println();

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        /*SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println("\n*****************************\n");

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

        System.out.println("\n*****************************\n");*/

        /*PoemBeautifuler poemBeautifuler = new PoemBeautifuler();
        System.out.println("7.1 Text decorator");
        poemBeautifuler.beautify("First text", (text) -> "***" + text + "***");
        poemBeautifuler.beautify("Second text", (text) -> "@@@ " + text + " @@@");
        poemBeautifuler.beautify("Third text", (text) -> "..." + text.toLowerCase() + "...");
        poemBeautifuler.beautify("Fourth text", (text) -> text.toUpperCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/
    }
}
