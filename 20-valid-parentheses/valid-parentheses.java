import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('|| i=='{'||i=='[')
            {
            st.push(i);
            }
            else{
                if(st.isEmpty())return false;
                char ch=st.peek();
                st.pop();
                if((i== ')' && ch=='(')|| (i== '}' && ch== '{')|| (i== ']' && ch== '['))continue;
            else
                return false;

            }
        }
        return st.isEmpty();

    }
}