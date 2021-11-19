package org.stackmybiz.exceptions;

public class NotEligibleForVoteException extends Exception {
    public NotEligibleForVoteException() {
        super("Not Eligible for Vote");
    }
    public NotEligibleForVoteException(String message) {
        super(message);
    }
}
