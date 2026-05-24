// A java program using interface

interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all four directions)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, dowm, left, right, diagonal (by one step)");
    }
}
public class Example1 {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
        King k = new King();
        k.moves();
    }
}