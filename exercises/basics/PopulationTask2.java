/*
 Country XYZ has a population of 10 million.
 The birth rate is 14 per 1,000 people,
 and the death rate is 8.

 Each year, one person is born and one dies less than the previous year.

 Calculate the population in 10 years,
 given that:
 - birth rate cannot be less than 7
 - death rate cannot be less than 6
*/


package basics;

public class PopulationTask2 {
    static void main(String[] args) {

        long population = 10_000_000;
        int birthRate = 14;
        int deathRate = 8;
        int year = 10;

        for (int i = 1; i <= year; i++) {

            int populationDif = birthRate - deathRate;
            population += population * populationDif / 1000;

            System.out.printf("year: %d | B: %d | D: %d | Population: %d\n", i, birthRate, deathRate, population);

            if (birthRate > 7) birthRate--;
            if (deathRate > 6) deathRate--;

        }
    }
}
