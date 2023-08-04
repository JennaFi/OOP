package seminar2.task4;

public interface IUser {
    int getUserId();


//    опред метода  реализацией по умолчанию
    default int getAdminId(){
        return  1;
    }

    static int getUniversalId() {
        return 0;
    }


}
