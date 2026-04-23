class Movie {
    String title;
    int releaseYear;

    Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    void play() {
        System.out.println("Playing: " + title + " (" + releaseYear + ")");
    }
}

class ActionMovie extends Movie {
    int stuntCount;

    ActionMovie(String title, int releaseYear, int stuntCount) {
        super(title, releaseYear);
        this.stuntCount = stuntCount;
    }

    void explode() {
        System.out.println(title + " has " + stuntCount + " explosions!");
    }
}

public class Cinema {
    public static void main(String[] args) {
        ActionMovie johnWick = new ActionMovie("John Wick", 2014, 120);
        johnWick.play();
        johnWick.explode(); 
    }
}