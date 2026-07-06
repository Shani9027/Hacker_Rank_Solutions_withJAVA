    int n = s.length();
        int ans = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for( int i = 0 ; i < n ; i++ ){
            for( int j = i ; j < n ; j++ ){
                String sub = s.substring( i , j+1 );
                char[] ch = sub.toCharArray();
                Arrays.sort(ch);
                String key = new String(ch);
                map.put( key , map.getOrDefault( key , 0 ) + 1 );
            }
        }
        for( int value : map.values() ){
            ans += value*(value - 1)/2;
        }
        return ans;
}