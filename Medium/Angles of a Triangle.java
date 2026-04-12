class Solution {
    public double[] internalAngles(int[] sides) {
        boolean validTriangle = false;
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        if (a + b > c && b + c > a && c + a > b) {
            validTriangle = true;
        }
        double[] angles = new double[3];
        if (validTriangle){
        angles[0] = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        angles[1] = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        angles[2] = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

        Arrays.sort(angles);
        return angles;
        }

        return new double[]{};
    }
}
