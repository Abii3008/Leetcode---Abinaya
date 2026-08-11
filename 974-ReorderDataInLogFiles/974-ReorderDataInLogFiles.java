// Last updated: 11/08/2026, 16:07:02
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] log1 = a.split(" ", 2);
            String[] log2 = b.split(" ", 2);
            boolean digit1 = Character.isDigit(log1[1].charAt(0));
            boolean digit2 = Character.isDigit(log2[1].charAt(0));
            if (!digit1 && !digit2) {
                int compare = log1[1].compareTo(log2[1]);
                if (compare == 0)
                    return log1[0].compareTo(log2[0]);
                return compare;
            }
            if (!digit1) return -1;
            if (!digit2) return 1;
            return 0;
        });
        return logs;
    }
}