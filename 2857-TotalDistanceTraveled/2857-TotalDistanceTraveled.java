// Last updated: 11/08/2026, 16:02:48
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        return(mainTank + Math.min((mainTank - 1)/4, additionalTank)) * 10;
    }
}