 public static String isBalanced(String s) {
        int n = s.length();
        if( (n%2) != 0 ){
            return "NO";
        }
        Stack<Character> st = new Stack<>();
        for( char i : s.toCharArray() ){
            if( i == '(' || i == '{' || i == '[' ){
                st.push(i);
            }
            if( (i == ')' || i == '}' || i == ']') ){
                if(st.isEmpty()) return "NO";
                char top = st.peek();
                if( ( i == ')' && top == '(' ) || ( i == ']' && top == '[' ) || ( i == '}' && top == '{' )) {
                st.pop();
                }else{
                    return "NO";
                }
            }
        }
        if(!st.isEmpty()) return "NO";
        return "YES";
    }

