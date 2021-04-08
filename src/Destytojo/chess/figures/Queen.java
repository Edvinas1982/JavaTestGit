package Destytojo.chess.figures;
import Destytojo.chess.types.Position;
import Destytojo.chess.figures.Figure;


public class Queen extends Figure {

    public Queen(char letter, int number, String color) {
        super(letter, number, color);
    }

//    @Override
//    public String toString() {
//        return "Queen: " + letter + number + ", " + color;
//    }

//    @Override
//    public void method1() {
//        //TODO ...
//    }

    @Override
    public Position[] possibleMovies() {
        return null;
    }
}
