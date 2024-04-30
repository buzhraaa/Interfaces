

public class Main {
    public static void main(String[] args) {
        // Testing Movie class
        Movie movie = new Movie("Inception");
        System.out.println(movie.playContent());
        System.out.println(movie.pauseContent());
        System.out.println(movie.stopContent());

        // Testing Game class
        Game game = new Game("Super Mario Bros.");
        System.out.println(game.playContent());
        System.out.println(game.pauseContent());
        System.out.println(game.stopContent());
    }
}