class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> roman =new HashMap<>();
        Map<String, Integer> roman1 = Map.of("I", 1, "V", 5,"X",10,"L",50,"C",100,"D",500,"M",1000);
        int cardinal=0;
        for(int i=0;i<s.length();i++){
            int current = roman1.get(String.valueOf(s.charAt(i)));
            int next= (i+1 <s.length()) ? roman1.get(String.valueOf(s.charAt(i+1))): 0;   
            if(current<next){
                cardinal=cardinal-current;
            }     
            else  cardinal=cardinal+current;
                 }
                 return cardinal;
                 
                     }
}