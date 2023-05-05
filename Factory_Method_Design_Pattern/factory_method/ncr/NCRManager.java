package Factory_Method_Design_Pattern.factory_method.ncr;

import Factory_Method_Design_Pattern.factory_method.Member;
import Factory_Method_Design_Pattern.factory_method.MemberManager;
import Factory_Method_Design_Pattern.factory_method.MemberType;

public class NCRManager extends MemberManager {
    private MemberType memberType;

    @Override
    protected Member createMember(MemberType type, String name, String id) {
        this.memberType = type;
        return NCRFactory.getNCRFactory(type, name, id);
    }

    @Override
    public String getPrivacyPolicies() {
        return "Couples are not allowed near the pool";
    }

    @Override
    public String getDiscountPercentage() {
        switch (memberType) {
            case LIFETIME:
                return "Since the  member is " + memberType + " " + "Discount will be 100%";
            case MONTHLY:
                return "Since the  member is " + memberType + " " + "Discount will be 50%";
            case TEMP:
                return "Since the  member is " + memberType + " " + "Discount will be 20%";
            default:
                return "0%";
        }
    }
}
