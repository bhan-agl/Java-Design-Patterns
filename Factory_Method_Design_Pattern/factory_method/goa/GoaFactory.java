package Factory_Method_Design_Pattern.factory_method.goa;

import Factory_Method_Design_Pattern.factory_method.Member;
import Factory_Method_Design_Pattern.factory_method.MemberType;

public class GoaFactory {

    private GoaFactory() {
    }

    public static Member getGoaFactory(MemberType type, String memberName, String id) {
        switch (type) {
            case LIFETIME:
                return new GoaLifetimeMember(memberName, id);
            case MONTHLY:
                return new GoaMonthlyMember(memberName, id);
            case TEMP:
                return new GoaTempMember(memberName, id);
            default:
                throw new IllegalArgumentException("Member type unknown");
        }
    }

}
