public class Main {
    public static void main(String[] args){
        LoginService ls = new LoginService();
        UserMigrationService ums = new UserMigrationService();

        ls.registerUser();
        ums.migrateUser();

    }
}
