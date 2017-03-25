package ro.isr.deschool.poo.chess;

/**
 * Created by ionutmihailescu on 3/14/17.
 */
public class Queen extends Piece {


    public Queen(PieceColor color, Square placeAt, boolean moved) {
        super(color, placeAt, moved);
    }

    @Override
    public Square[] validMoves() {
        return new Square[0];
    }

    @Override
    public Square[] attackSquares() {
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
