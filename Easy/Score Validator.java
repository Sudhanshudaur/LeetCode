class Solution {
    public int[] scoreValidator(String[] events) {
        int total = 0;
        int cnt = 0;

        for (int i = 0; i < events.length; i++) {

            if (cnt == 10)
                break;
            if (events[i].equals("W")) {
                cnt++;
            } else if (events[i].equals("WD") || events[i].equals("NB")) {
                total++;
            } else {
                total += Integer.parseInt(events[i]);
            }
        }

        return new int[]{total, cnt};
    }
}
