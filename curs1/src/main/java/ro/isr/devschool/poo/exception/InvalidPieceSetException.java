package ro.isr.devschool.poo.exception;

/**
 * Created by eduard-gabrielmanda on 14/03/17.
 */

/**
 * Spre deosebire de descendentii directi din Exception, exceptiile
 * care au parinte RuntimeException nu trebuiesc tratate
 */
public class InvalidPieceSetException extends RuntimeException {

    public InvalidPieceSetException() {
        super("Invalid piece set exception.");
    }

}
