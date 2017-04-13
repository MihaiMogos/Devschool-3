package ro.isr.devschool.poo.chess.exception;

/**
 * Created by crist on 14-Mar-17.
 */
/*
    Spre deosebire de descendentii directi din Exception, exceptiile care au ca parinte RuntimeException nu trebuie tratate
 */
public class InvalidPieceSetException extends RuntimeException{
    public InvalidPieceSetException(){
        // ctrl-p la inceputul metodei sa vad parametri metodei
        super("Invalid piece set exception");
    }

}
