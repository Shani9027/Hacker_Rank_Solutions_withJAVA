 HashSet<Integer> hs = new HashSet<>();
        for( int i : arr ){
            hs.add(i);
        }
        
        int count = 0;
        
        for( int i : arr ){
            if( hs.contains( i-k )){
                count++;
            }
        }
        return count;
}