package me.exercise;

import java.util.LinkedList;

/**
 * Created by Chase_Zhang on 12/7/14.
 */
public class Ex7 {
    // dogs and cats

    public class Animal {
        protected String name;
        protected int order;

        public Animal(String name, int order) {
            this.name = name;
            this.order = order;
        }
    }

    public class AnimalQueue {
        LinkedList<Animal> dogsQueue = new LinkedList<Animal>();
        LinkedList<Animal> catsQueue = new LinkedList<Animal>();
        int order = 0;

        private void enqueue(Animal animal) {
            if (animal.name.equals("dog")) dogsQueue.addLast(animal);
            else catsQueue.addLast(animal);
        }

        public Animal dequeue() {
            if (dogsQueue.isEmpty()) return getCat();
            if (catsQueue.isEmpty()) return getDog();

            if (dogsQueue.peek().order < catsQueue.peek().order) return getDog();
            else return getCat();
        }

        public void addDog() {
            enqueue(new Animal("dog", order++));
        }

        public void addCat() {
            enqueue(new Animal("cat", order++));
        }

        public Animal getDog() {
            return dogsQueue.poll();
        }

        public Animal getCat() {
            return catsQueue.poll();
        }
    }

    public AnimalQueue createAnimalQueue() {
        return new AnimalQueue();
    }
}
