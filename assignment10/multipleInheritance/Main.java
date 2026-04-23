interface Action {
    void fightScene();
}

interface Comedy {
    void joke();
}

interface ActionComedy extends Action, Comedy {
    void tagline();
}

class Movie implements Action, Comedy {
    private String name;

    Movie(String name) {
        this.name = name;
    }

    public void fightScene() {
        System.out.println(name + " has an awesome fight scene!");
    }

    public void joke() {
        System.out.println(name + " makes you laugh!");
    }
}

class Blockbuster implements ActionComedy {
    public void fightScene() {
        System.out.println("Explosions and punches!");
    }

    public void joke() {
        System.out.println("Funny one-liner!");
    }

    public void tagline() {
        System.out.println("Laugh, then fight!");
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m = new Movie("Rush Hour");
        m.fightScene();
        m.joke();

        System.out.println();

        Blockbuster b = new Blockbuster();
        b.fightScene();
        b.joke();
        b.tagline();
    }
}