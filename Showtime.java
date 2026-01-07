import java.time.LocalDateTime;

public class Showtime {
    private LocalDateTime time;
    private Movie movie;
    private boolean available = true;

    public Showtime(LocalDateTime time, Movie movie) {
        this.time = time;
        this.movie = movie;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Movie getMovie() {
        return movie;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        available = false;
    }
}
