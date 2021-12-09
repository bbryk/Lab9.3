package builder;

public class Main {
    public  static void main(String args[]){
        User user = User.builder()
                .firstName("Bogdan")
                .lastName("Bryk")
                .age(30)
                .occupation("UCU")
                .occupation("Nora Bobra")
                .build();
        System.out.println(user);
    }
}
