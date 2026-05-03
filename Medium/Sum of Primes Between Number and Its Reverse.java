class Solution {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int sumOfPrimesInRange(int n) {
        int given = n;
        int rev = 0;

        while (given > 0) {
            rev = rev * 10 + given % 10;
            given /= 10;
        }

        int sum = 0;
        int max = 0;
        int min = 0;
        if (n > rev) {
            max = n;
            min = rev;
        } else {
            max = rev;
            min = n;
        }

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
