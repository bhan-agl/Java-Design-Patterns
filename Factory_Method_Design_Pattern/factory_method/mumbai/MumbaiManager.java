package Factory_Method_Design_Pattern.factory_method.mumbai;

import Factory_Method_Design_Pattern.factory_method.Member;
import Factory_Method_Design_Pattern.factory_method.MemberManager;
import Factory_Method_Design_Pattern.factory_method.MemberType;

public class MumbaiManager extends MemberManager {
    private MemberType memberType;

    @Override
    protected Member createMember(MemberType type, String name, String id) {
        return MumbaiFactory.getMumbaiFactory(type, name, id);
    }

    @Override
    public String getPrivacyPolicies() {
        return "Babies are not allowed near the pool";
    }


    @Override
    public String getDiscountPercentage() {
        switch (memberType) {
            case LIFETIME:
                return "Since the  member is " + memberType + " " + "Discount will be 80%";
            case MONTHLY:
                return "Since the  member is " + memberType + " " + "Discount will be 30%";
            case TEMP:
                return "Since the  member is " + memberType + " " + "Discount will be 10%";
            default:
                return "0%";
        }
    }
}
