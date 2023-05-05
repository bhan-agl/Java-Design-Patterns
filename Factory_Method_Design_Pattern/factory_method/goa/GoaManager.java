package Factory_Method_Design_Pattern.factory_method.goa;

import Factory_Method_Design_Pattern.factory_method.Member;
import Factory_Method_Design_Pattern.factory_method.MemberManager;
import Factory_Method_Design_Pattern.factory_method.MemberType;

public class GoaManager extends MemberManager {
    private MemberType memberType;

    @Override
    protected Member createMember(MemberType type, String memberName, String id) {
        this.memberType = type;
        return GoaFactory.getGoaFactory(type, memberName, id);
    }

    @Override
    public String getPrivacyPolicies() {
        return "Bikinis are allowed inside the pool";
    }

    @Override
    public String getDiscountPercentage() {
        switch (memberType) {
            case LIFETIME:
                return "Since the  member is " + memberType + " " + "Discount will be 90%";
            case MONTHLY:
                return "Since the  member is " + memberType + " " + "Discount will be 40%";
            case TEMP:
                return "Since the  member is " + memberType + " " + "Discount will be 5%";
            default:
                return "0%";
        }
    }
}
