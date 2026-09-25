public class LoginService {
    public void registerUser(){
        UserBuilder builder = new UserBuilder()
                .setName("Sanobar")
                .setAge(18);
        User user = new User(builder);
        System.out.println("User registered successfully " + user);

    }
}
