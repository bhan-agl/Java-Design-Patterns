package Factory_Method_Design_Pattern.factory_method;

public interface Member {
    String getMemberName();
    String getId();

    void register();

    void notifyMembers();

    void savePersonalInfoAfterNotify();
}
