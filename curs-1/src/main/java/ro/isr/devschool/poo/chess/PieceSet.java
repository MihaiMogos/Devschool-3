package ro.isr.devschool.poo.chess;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ro.isr.devschool.poo.chess.exception.InvalidPieceSetException;

import java.util.List;

/**
 * Created by scipianus on 14-Mar-17.
 */
@NoArgsConstructor
@Getter
public class PieceSet {
    private List<Piece> pieces;
    private PieceColor pieceColor;

    public PieceSet(List<Piece> pieces, PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        this.setPieces(pieces);
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }

    private void validatePieceSet(List<Piece> pieces) {
        if (pieces == null || pieces.size() != 16) {
            throw new InvalidPieceSetException();
        }
    }
}
