package ro.isr.deschool.poo.chess;

import ro.isr.deschool.poo.chess.exception.InvalidPieceSetException;

import java.util.List;

/**
 * Created by ionutmihailescu on 3/14/17.
 */
public class PieceSet {

    private List<Piece> pieces ;
    private PieceColor color;

    public PieceSet(List<Piece> pieces,PieceColor color){
        setPieces(pieces);
        this.color=color;

    }

    public void setPieces(List<Piece> pieces) {
        validatePieceSet(pieces);
        this.pieces = pieces;
    }

    private void validatePieceSet(List<Piece> pieces) {
        if(pieces==null||pieces.size()!=16){
                throw new InvalidPieceSetException();
        }
    }
}
