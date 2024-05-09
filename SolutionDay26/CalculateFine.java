package SolutionDay26;

public class CalculateFine {
    static int calculateFine(int returnedDay, int returnedMonth, int returnedYear,
                             int dueDay, int dueMonth, int dueYear) {
        if (returnedYear == dueYear) {
            if (returnedMonth == dueMonth) {
                if (returnedDay > dueDay) {
                    return 15 * (returnedDay - dueDay);
                }
            } else if (returnedMonth > dueMonth) {
                return 500 * (returnedMonth - dueMonth);
            }
        } else if (returnedYear > dueYear) {
            return 10000;
        }
        return 0;
    }
}
