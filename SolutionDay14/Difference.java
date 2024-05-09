package SolutionDay14;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference () {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int element : elements) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        } maximumDifference = Math.abs(max - min);
    }
}


