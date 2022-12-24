package week04_review;

public class FreequencyOfWorld {

    public static void main(String[] args) {
        String sentence = "Java Java Java Java Python C# Ruby C++ Swift";
        int originallength = sentence.length();
        String temp = sentence.replace("Java", "abc");
        int newlength = temp.length();
        System.out.println(sentence);
        System.out.println(temp);

        System.out.println(originallength);
        System.out.println(newlength);
        int frequencyJava = originallength - newlength;
        System.out.println(frequencyJava);


        System.out.println("____________________________" );

        String s = "Python is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly procedural), object-oriented and functional programming. It is often described as a \"batteries included\" language due to its comprehensive standard library.[34][35]\n" +
                "\n" +
                "Guido van Rossum began working on Python in the late 1980s as a successor to the ABC programming language and first released it in 1991 as Python 0.9.0.[36] Python 2.0 was released in 2000 and introduced new features such as list comprehensions, cycle-detecting garbage collection, reference counting, and Unicode support. Python 3.0, released in 2008, was a major revision that is not completely backward-compatible with earlier versions. Python 2 was discontinued with version 2.7.18 in 2020.[37]";

                String t =s.replace("Python", "spoon");
                int frequencyOfPhyton = s.length() - t.length();
        System.out.println(frequencyOfPhyton);


    }


}

/*
1. Write a program that can return the frequency of the word "Java" from a sentence
				Ex:
					sentence = "Java Java Java Java Python C# Ruby C++ Swift"
					output: 4
			DO NOT implement any new topics (Loops, custom methods etc)
 */


