class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") 
            && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                // its a number
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            } else { // operator
                int rightNum = stack.pop();
                int leftNum = stack.pop();
                if( tokens[i].equals("+")) {
                   stack.push(leftNum + rightNum);
                } else if(tokens[i].equals("-")) {
                    stack.push(leftNum - rightNum);
                } else if(tokens[i].equals("*")) {
                    stack.push(leftNum * rightNum);
                } else if (tokens[i].equals("/")){
                    stack.push(leftNum/rightNum);
                } 
                
            }
           
        }
        return stack.pop();
    }
}
