package src.LLD.interview.stackoverflow.user;

public class User {
    private String userId;
    private String username;
    private int reputation;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
        this.reputation = 0;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void addReputation(int newReputationPoints){
        this.reputation+=newReputationPoints;
    }
}
