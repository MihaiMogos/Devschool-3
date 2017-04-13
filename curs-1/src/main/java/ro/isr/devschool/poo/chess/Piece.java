package ro.isr.devschool.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by crist on 14-Mar-17.
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class Piece {
    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    // method without body - to be implemented by child classes
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();
}
