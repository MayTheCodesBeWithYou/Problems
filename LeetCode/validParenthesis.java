class validParenthesis {
    public boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
            }
            else
            {
                if(st.size()==0)
                {
                    return false;
                }
                else if(st.peek()=='(' && ch!=')')
                {
                    return false;
                }
                else if(st.peek()=='[' && ch!=']')
                {
                    return false;
                }
                else if(st.peek()=='{' && ch!='}')
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return st.size()==0?true:false;
    }
}