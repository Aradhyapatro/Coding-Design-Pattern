package CreationalDesignPattern.BuilderPattern;

public class Test {
    public static void main(String[] args) {
        User u= new User.userBuilder().setEmail("aradhyapatro14@gmail.com")
                .setName("Patro").setEmpId(1234L).getUser();
        System.out.println(u);
    }
}
