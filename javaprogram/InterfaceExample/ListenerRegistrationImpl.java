public class ListenerRegistrationImpl implements ListnerRegistration
{
    ListenerRegistrationImpl(){
        System.out.println("constructor");
    } 

    public void remove(){
        System.out.println("removed");
    }
}
