package Factory_Method_Design_Pattern.factory_method.ncr;

import Factory_Method_Design_Pattern.factory_method.Member;
import Factory_Method_Design_Pattern.factory_method.MemberType;

public class NCRFactory {

    private NCRFactory() {
    }

    public static Member getNCRFactory(MemberType type, String memberName, String id) {
        switch (type) {
            case LIFETIME:
                return new NCRLifetimeMember(memberName, id);
            case MONTHLY:
                return new NCRiMonthlyMember(memberName, id);
            case TEMP:
                return new NCRTempMember(memberName, id);
            default:
                throw new IllegalArgumentException("Member type unknown");
        }
    }
}
