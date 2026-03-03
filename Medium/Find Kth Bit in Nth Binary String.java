class Solution {
    public char findKthBit(int n, int k) {
         String s="0";
        for(int i=2;i<=n;i++){
           String inverted= invert(s);
           String reversed=new StringBuilder(inverted).reverse().toString();
           s=s+"1"+reversed;
        }
        return s.charAt(k-1);
    }
    private String invert(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='0'){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        return new String(sb);
    }
}
