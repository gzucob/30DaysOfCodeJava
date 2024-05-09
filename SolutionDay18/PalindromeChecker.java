package SolutionDay18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public Stack<Character> stack;
    public Queue<Character> queue;

    public PalindromeChecker() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public char dequeueCharacter() {
        return queue.poll();
    }

    public char popCharacter() {
        return stack.pop();
    }
}
