package Factory_Method_Design_Pattern.factory_method;

public abstract class MemberManager {


    public void createMemberShip(MemberType type, String name, String id) {
        Member member = createMember(type, name, id);
        member.register();
        member.notifyMembers();
        member.savePersonalInfoAfterNotify();
    }

    protected abstract Member createMember(MemberType type, String name, String id);

    public abstract String getPrivacyPolicies();

    public abstract String getDiscountPercentage();
}
