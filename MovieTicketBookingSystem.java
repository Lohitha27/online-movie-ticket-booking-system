import java.time.LocalDateTime;

public class MovieTicketBookingSystem {

    public static void main(String[] args) {

        // Create a movie
        Movie movie = new Movie("Inception", "Sci-Fi", 148);

        // Create a theater
        Theater theater = new Theater("IMAX Theater", "City Center");

        // Create a showtime
        Showtime showtime = new Showtime(
                LocalDateTime.of(2025, 6, 10, 19, 30),
