package day01;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie("Very good movie",2000);
        movie.addActor(new Actor("Jack",1980));
        movie.addActor(new Actor("Bob",1970));
        movie.addActor(new Actor("John",1974));
        movie.addActor(new Actor("Jill",1930));
        movie.addActor(new Actor("Tom",1976));

        System.out.println(movie.actorsInTheirTwenties());
    }
}
