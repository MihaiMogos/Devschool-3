package ro.isr.deschool.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ionutmihailescu on 3/14/17.
 */
@Setter
@Getter
@AllArgsConstructor
public abstract class Piece {

    private PieceColor color;
    private  Square placeAt;
    private  boolean moved;

    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();

}
