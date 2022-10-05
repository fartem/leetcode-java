package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/
public class MinimumHoursOfTrainingToWinACompetition {

    private final int initialEnergy;
    private int initialExperience;
    private final int[] energy;
    private final int[] experience;

    public MinimumHoursOfTrainingToWinACompetition(
            int initialEnergy,
            int initialExperience,
            int[] energy,
            int[] experience
    ) {
        this.initialEnergy = initialEnergy;
        this.initialExperience = initialExperience;
        this.energy = energy;
        this.experience = experience;
    }

    public int solution() {
        int eSum = 0;
        for (int e : energy) {
            eSum += e;
        }
        int result = eSum - initialEnergy >= 0 ? eSum - initialEnergy + 1 : 0;
        for (int e : experience) {
            if (initialExperience <= e) {
                result += e - initialExperience + 1;
                initialExperience = e + 1;
            }
            initialExperience += e;
        }
        return result;
    }

}
