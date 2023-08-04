package seminar2.task4;

public class Main {
    public static void main(String[] args) {
        Test4 test1 = new Test4();

        System.out.println("Пользователь" + test1.getUserId());
        System.out.println("Админ" + test1.getAdminId());

        int uId = IUser.getUniversalId();
        System.out.println(uId);
    }
}
