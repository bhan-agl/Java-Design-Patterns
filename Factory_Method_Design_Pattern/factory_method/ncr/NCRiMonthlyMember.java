package Factory_Method_Design_Pattern.factory_method.ncr;

import Factory_Method_Design_Pattern.factory_method.Member;

public class NCRiMonthlyMember implements Member {
    private String memberName, id;

    public NCRiMonthlyMember(String memberName, String id) {
        this.memberName = memberName;
        this.id = id;
    }

    @Override
    public String getMemberName() {
        return this.memberName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void register() {
        System.out.println("NCR Monthly member named " + this.memberName + " and " + this.id + " has been registered successfully");
    }

    @Override
    public void notifyMembers() {
        System.out.println("NCR Monthly member named " + this.memberName + " and " + this.id + " has been notified");
    }

    @Override
    public void savePersonalInfoAfterNotify() {
        System.out.println("NCR Monthly member named " + this.memberName + " and " + this.id + " details has been saved");

    }
}
