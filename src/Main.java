public class Main {
    public static void main(String[] args) {
//        Bank nathanAccount = new Bank(12345, 0.00, "njds1676@gmail.com", "Nathan", "123456789");
//        System.out.println(nathanAccount.getPhoneNumber());
//        nathanAccount.withdrawFunds(5);
//        nathanAccount.depositFunds(150);
//
////  you can use a constructor to set fields
//
//        Bank nathanAccount2 = new Bank(123456, 0.00, "Test", "Test", "Test");
//        System.out.println(nathanAccount2.getAccountNumber());
        VIPCustomer person = new VIPCustomer("Nathan", 5000, "email@email.com");
        System.out.println(person.getName());

        VIPCustomer person2 = new VIPCustomer("Jack", 5000);
        System.out.println(person2.getName());

        VIPCustomer person3 = new VIPCustomer("Bob", 5000, "Test@test.com");
        System.out.println(person3.getName());
    }
}

