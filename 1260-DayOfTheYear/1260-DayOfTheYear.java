// Last updated: 11/08/2026, 16:05:57
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}