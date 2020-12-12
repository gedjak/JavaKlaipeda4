package FundamentalsTesting.advanced.colections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();
        pokemons.offer("Charmader");
        pokemons.add("Pikachu");

        System.out.println(pokemons.peek()); // paziurim kas pirmas eileje
        System.out.println(pokemons.poll()); // isimti pirma eileje esanti elementa
        System.out.println(pokemons.peek()); //spausdinamas naujas pirmasis narys

    }
}
