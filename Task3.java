package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	String testString ;
        Scanner u= new Scanner(System.in);
        System.out.println("Enter string for inspection");
        testString=u.nextLine();
	if (args.length > 0) {
        testString = args[0];
    }
    Stack<Character> stringStack = new Stack<>();
    char [] chars = testString.toCharArray();
    for (int i=0; i < chars.length; i++){
        switch (chars[i]){
            case '(':
            case '[':
            case '{':
                stringStack.push(chars[i]);
                break;
            case ')':
                if (isMatchingClose(stringStack, '(')){
                    System.out.println("Not balanced: is missing '(' in front of ')'");
                    return;
                }
                break;
            case ']':
                if (isMatchingClose(stringStack, '[')){
                    System.out.println("Not balanced: is missing '[' in front of  ']'");
                    return;
                }
                break;
            case '}':
                if (isMatchingClose(stringStack, '{')){
                    System.out.println("Not balanced: is missing '{' in front of  '}'");
                    return;
                }
                break;
        }
    }
    if (stringStack.isEmpty()){
        System.out.println(testString + " is balanced String.");
    } else {
        System.out.println(testString + " is NOT balanced String.");
    }
}
private static boolean isMatchingClose(Stack<Character> stringStack, char openingBracket){
    return stringStack.isEmpty() || !stringStack.pop().equals(openingBracket);
    }
}
