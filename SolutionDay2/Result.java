package SolutionDay2;

class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        long total;

        double tip, tax;

        tip = (meal_cost * tip_percent) / 100;
        tax = (meal_cost * tax_percent) / 100;

        total = Math.round(meal_cost + tip + tax);
        System.out.println(total);
    }
}