class Solution {
    public int countKthRoots(int l, int r, int k) {
        int cnt = 0;
        long lt = (long)Math.ceil(Math.pow(l, 1.0/k));
        long rt = (long)Math.floor(Math.pow(r, 1.0/k));

        while(Math.pow(lt,k)< l) lt++;
        while(lt>0 && Math.pow(lt-1,k)>=l) lt--;

        while(Math.pow(rt,k)>r) rt--;
        while(Math.pow(rt+1,k)<=r) rt++;
        return (int)Math.max(0, rt-lt+1);
    }
}
