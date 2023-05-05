package Factory_Method_Design_Pattern.factory_method.mumbai;

import Factory_Method_Design_Pattern.factory_method.Member;
import Factory_Method_Design_Pattern.factory_method.MemberType;

public class MumbaiFactory {

    private MumbaiFactory() {
    }

    public static Member getMumbaiFactory(MemberType type, String memberName, String id) {
        switch (type) {
            case LIFETIME:
                return new MumbaiLifetimeMember(memberName, id);
            case MONTHLY:
                return new MumbaiMonthlyMember(memberName, id);
            case TEMP:
                return new MumbaiTempMember(memberName, id);
            default:
                throw new IllegalArgumentException("Member type unknown");
        }
    }
}
