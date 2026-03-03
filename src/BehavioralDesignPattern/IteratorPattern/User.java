package BehavioralDesignPattern.IteratorPattern;

public class User {
    private String name;
    private long userId;

    public User(long userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
