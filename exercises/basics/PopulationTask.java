package basics;

public class PopulationTask {
    static void main(String[] args){

        long population = 10_000_000;
        final int POPULATION_BORN = 14;
        final int POPULATION_DEATH = 8;
        final int POPULATION_DIF = POPULATION_BORN - POPULATION_DEATH;
        int year = 10;

        for (int i = 1; i <= year; i++){
            population += population * POPULATION_DIF / 1000;
            System.out.println("Population in " + i + " years - " + population);
        }
    }
}
