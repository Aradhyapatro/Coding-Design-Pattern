package CreationalDesignPattern.BuilderPattern;

public class User {
    private final String name;
    private final String email;
    private final long empId;

    private User(userBuilder user){
        this.name=user.name;
        this.email=user.email;
        this.empId=user.empId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", empId=" + empId +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getEmpId() {
        return empId;
    }

    static class userBuilder{
        private  String name;
        private  String email;
        private  long empId;

        public userBuilder(){

        }

        public User getUser(){
            User u = new User(this);
            return u;
        }

        public userBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public userBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public userBuilder setEmpId(long empId) {
            this.empId = empId;
            return this;
        }
    }
}
