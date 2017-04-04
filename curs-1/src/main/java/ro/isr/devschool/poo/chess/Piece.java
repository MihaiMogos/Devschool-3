package ro.isr.devschool.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by scipianus on 14-Mar-17.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Piece {
    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    public abstract Square[] validMoves();

    public abstract Square[] atackSquares();

    public abstract Square[] captureFreeMoves();

    public abstract boolean toBeCaptured();
}
