import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * queuesAndStacks
 */
public class queuesAndStacks {

    public class Solution {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        void pushCharacter(char character) {
            stack.push(character);
        }

        void enqueueCharacter(char character) {
            queue.add(character);
        }

        char popCharacter() {
            return stack.pop();
        }

        char dequeueCharacter() {
            return queue.remove();
        }

    }
}