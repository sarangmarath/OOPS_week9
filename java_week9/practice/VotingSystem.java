public class VotingSystem {
    public void processVote(String voterId, String candidate) {
        class VoteValidator {
            public boolean validate(String id) {
                return id != null && id.startsWith("VOTER") && id.length() > 6;
            }
        }

        VoteValidator validator = new VoteValidator();
        if (validator.validate(voterId)) {
            System.out.println("Vote recorded for " + candidate + " by voter " + voterId);
        } else {
            System.out.println("Invalid voter ID: " + voterId);
        }
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.processVote("VOTER123", "Alice");
        vs.processVote("ABC", "Bob");
    }
}
