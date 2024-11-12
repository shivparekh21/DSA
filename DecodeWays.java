class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0'){
            return 0;
        }
        int way1 = 1;
        int way2 = 1;
        for(int i=1; i<s.length(); i++){
           
            int current = 0;
            if(s.charAt(i) != '0'){
                current = way1;
            }
            int num = Integer.parseInt(s.substring(i-1,i+1));
            if(num>=10 && num<=26){
                current = current + way2;
            }
            way2 = way1;
            way1 = current;
            System.out.println(way2+""+way1);
        }
        return way1;
    }
}