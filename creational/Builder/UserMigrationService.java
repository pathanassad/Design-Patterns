public class UserMigrationService {
    public void migrateUser(){
        UserBuilder builder = new UserBuilder();
        builder.setName("Asad")
                .setAge(25)
                .setCity("Pune")
                .setEmail("pathanassad@gmail.com");

        User user =  new User(builder);
        System.out.println("User migrated -> " + user);


    }



}
