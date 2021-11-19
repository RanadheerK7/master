package org.stackmybiz.exceptions;

public class CustomException {
    public void eligibleForVote(int age) throws NotEligibleForVoteException {
            if (age >= 18) {
                System.out.println("Eligible for vote");
            } else {
                throw new NotEligibleForVoteException("Not eligible for vote");
            }
        }

    public static void main(String[] args) {
        CustomException cust = new CustomException();
        try {
            cust.eligibleForVote(17);
        } catch (NotEligibleForVoteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Custom exception completed");
        }

    }
}
