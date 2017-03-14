package ro.isr.devschool.poo.chess;

import ro.isr.devschool.poo.chess.exception.InvalidPieceSetException;

import java.util.List;

/**
 * Created by Mucefix on 14/03/17.
 */
public class PieceSet {

    private List<Piece> pieces;
    private PieceColor pieceColor;

    public PieceSet(List<Piece> pieces, PieceColor pieceColor){
        setPieces(pieces);
        this.pieceColor = pieceColor;
    }

    public void setPieces(List<Piece> pieces){
        validatePieceSet(pieces);
        this.pieces = pieces;
    }

    private void validatePieceSet(List<Piece> pieces) {
        if( pieces == null || pieces.size() != 16 ){
            throw new InvalidPieceSetException();
        }
    }


}
