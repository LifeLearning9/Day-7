# Day-7: Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

**TestCases**
 1. Input: s = "()"        Output: true
 2. Input: s = "(]"        Output: false
    
**Intuition**
The problem is checking if a given string of brackets is valid.
The rule:
1. Every opening bracket ((, {, [) must have a matching closing bracket (), }, ]) of the same type.
2. Brackets must close in the reverse order they were opened (LIFO — Last In, First Out).
A Stack is the perfect data structure for this because:
It stores opening brackets as we see them.
When we see a closing bracket, we pop from the stack and check if it matches the type.

**Algorithm**
1. If the string length is odd → print false and exit (because you can’t have matching pairs in an odd-length string).
2. Initialize a stack:
   Create an empty stack to store opening brackets.
   Iterate through each character in the string:
3. If it’s an opening bracket ((, {, [), push it onto the stack.
4. If it’s a closing bracket (), }, ]):
5. If the stack is empty → invalid (no opening bracket to match).
6. Pop the top element.
7. If the popped element doesn’t match the closing bracket type → invalid.
8. After the loop, check:
   If the stack is empty → valid (all brackets matched and closed).
   If not empty → invalid (some opening brackets were never closed).

**Complexity Analysis:**
a.Time complexity : O(n)
b.Space complexity: O(n)

