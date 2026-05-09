class Solution {
    public int minFlips(String s) {

           int n = s.length(); 

            int set = 0;
            int nonset = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1')
                    set++;
                if (s.charAt(i) == '0')
                    nonset++;
            }

            int ans = Math.min(set, nonset);

            for (int i=0; i<n; i++){
                int cost;
                if (s.charAt(i) == '1')
                    cost = set - 1;
                else
                    cost = nonset + 1;
                ans = Math.min(cost, ans);
            }

            

            if (n >= 2){
                int midset = 0;
                for (int i=1; i<n-1; i++){
                    if (s.charAt(i) == '1')
                        midset++;
                }
                int cost = midset;
                if (s.charAt(0) == '0') cost++;
                if (s.charAt(n-1) == '0') cost++;

                ans = Math.min(cost,ans);
            }

        return ans;
    }
}
