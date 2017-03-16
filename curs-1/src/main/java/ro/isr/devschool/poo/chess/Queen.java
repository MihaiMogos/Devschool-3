package ro.isr.devschool.poo.chess;

/**
 * Created by scipianus on 14-Mar-17.
 */
public class Queen extends Piece {
    @Override
    public Square[] validMoves() {
        return new Square[0];
    }

    @Override
    public Square[] atackSquares() {
        return new Square[0];
    }

    @Override
    public Square[] captureFreeMoves() {
        return new Square[0];
    }

    @Override
    public boolean toBeCaptured() {
        return false;
    }
}
