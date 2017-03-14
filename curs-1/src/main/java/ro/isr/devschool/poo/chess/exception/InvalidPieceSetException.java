package ro.isr.devschool.poo.chess.exception;

/**
 * Created by Mucefix on 14/03/17.
 */
/*
    Spre deosebire de descendentii directi din Exception, exceptiile
     care au ca parinte RuntimeException nu trebuiesc tratate
 */
public class InvalidPieceSetException extends RuntimeException{

    public InvalidPieceSetException(){
        super("Invalid piece set exception");
    }

}
