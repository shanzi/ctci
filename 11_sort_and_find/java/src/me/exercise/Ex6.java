package me.exercise;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Chase_Zhang on 12/14/14.
 */
public class Ex6 {
    public static class Person implements Comparable<Person> {
        int height;
        int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public boolean isBefore(Person p) {
            return height < p.height && weight < p.weight;
        }

        @Override
        public int compareTo(Person p) {
            if (this.height == p.height) {
                return this.weight - p.weight;
            } else {
                return this.height - p.height;
            }
        }
    }

    private static ArrayList<Person> longestIncreasingSeq(Person[] people, ArrayList<Person>[] solutions, int idx) {
        if (solutions[idx] != null) return solutions[idx];

        Person currentPerson = people[idx];
        ArrayList<Person> subSolution = null;
        int subSolutionLength = 0;

        for (int i = 0; i < idx; i++) {
            ArrayList<Person> currentSubSolution = longestIncreasingSeq(people, solutions, i);
            if (currentSubSolution.size() > subSolutionLength) {
                Person last = currentSubSolution.get(currentSubSolution.size() - 1);
                if (last.isBefore(currentPerson)) {
                    subSolutionLength = currentSubSolution.size();
                    subSolution = currentSubSolution;
                }
            }
        }

        ArrayList<Person> currentSolution = new ArrayList<Person>();
        if (subSolution != null) currentSolution.addAll(subSolution);

        currentSolution.add(currentPerson);
        solutions[idx] = currentSolution;
        return currentSolution;
    }

    public static ArrayList<Person> longestIncreasingSeq(Person[] people) {
        ArrayList<Person>[] solutions = new ArrayList[people.length];
        Arrays.sort(people);

        longestIncreasingSeq(people, solutions, people.length-1);

        int longest = 0;
        ArrayList<Person> longestSolution = null;

        for (int i = 0; i < solutions.length; i++) {
            if (solutions[i].size() > longest) {
                longest = solutions[i].size();
                longestSolution = solutions[i];
            }
        }

        return longestSolution;
    }
}
