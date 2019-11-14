/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testf;

/**
 *
 * @author Shanoor
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String m ="---\n" +
                    "title: \"What is SRP?\"\n" +
                    "description: \"SRP is a programming paradigm which advocates code writing as per responsibility.\"\n" +
                    "preview_image: /images/blog/2018/what-is-srp/article-header.png\n" +
                    "section: blog\n" +
                    "author: John Doe\n" +
                    "date: 2018-01-08 10:00 UTC\n" +
                    "tags: Development, Programming, principle\n" +
                    "published: true\n" +
                    "---\n" +
                    "\n" +
                    "The single responsibility principle is a computer programming principle that states that every module, class, or function[1] should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class. All its services should be narrowly aligned with that responsibility. Robert C. Martin expresses the principle as, \"A class should have only one reason to change,\"[1] although, because of confusion around the word \"reason\" he more recently stated \"This principle is about people.(Actor)\"[2]\n" +
                    "\n" +
                    "READMORE\n" +
                    "\n" +
                    "![SRP](/images/blog/2018/what-is-srp/article-header.png)\n" +
                    "\n" +
                    "## History\n" +
                    "\n" +
                    "CThe term was introduced by Robert C. Martin in an article by the same name as part of his Principles of Object Oriented Design,[3] made popular by his book Agile Software Development, Principles, Patterns, and Practices.[4] Martin described it as being based on the principle of cohesion, as described by Tom DeMarco in his book Structured Analysis and System Specification,[5] and Meilir Page-Jones in The Practical Guide to Structured Systems Design.[6] In 2014 Martin wrote a blog post entitled The Single Responsibility Principle with a goal to clarify what was meant by the phrase \"reason for change.\"\n" +
                    "\n" +
                    "## Annotation Types";

            String firstDevide[]=m.split("READMORE");
            String content=firstDevide[1];
            String secondDevide[]=firstDevide[0].split("---");
            String shortcontent=secondDevide[2];
            String thirdDevide[]=secondDevide[1].split("\n");
            String key[]=new String[thirdDevide.length];
            String value[]=new String[thirdDevide.length];
            for (int i = 1; i < thirdDevide.length; i++) {
//            System.out.println(thirdDevide[i]+"  --  "+i);
                String temp[]=thirdDevide[i].split(":");
                key[i-1]=temp[0];
                value[i-1]=temp[1];
        }
           
            System.out.print(key[1]+"--"+value[1]);
           
    }
   
}

