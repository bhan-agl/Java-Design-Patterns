package Factory_Method_Design_Pattern.client;

import Factory_Method_Design_Pattern.factory_method.MemberManager;
import Factory_Method_Design_Pattern.factory_method.MemberType;
import Factory_Method_Design_Pattern.factory_method.goa.GoaManager;
import Factory_Method_Design_Pattern.factory_method.ncr.NCRManager;

public class FactoryMethod {
    public static void main(String[] args) {
        MemberManager goaManager = new GoaManager();
        goaManager.createMemberShip(MemberType.TEMP, "Bhanu Kaushik", "001");

        String goaMangerDiscount = goaManager.getDiscountPercentage();
        String goaManagerPrivacyPolicy = goaManager.getPrivacyPolicies();

        displayDiscountAndPolicies(goaMangerDiscount, goaManagerPrivacyPolicy);

        /*============================================================*/

        MemberManager ncrManager = new NCRManager();
        ncrManager.createMemberShip(MemberType.LIFETIME, "NIK", "002");

        String ncrManagerDiscount = ncrManager.getDiscountPercentage();
        String ncrManagerPrivacyPolicy = ncrManager.getPrivacyPolicies();

        displayDiscountAndPolicies(ncrManagerDiscount, ncrManagerPrivacyPolicy);
    }

    private static void displayDiscountAndPolicies(String discount, String privacyPolicy) {
        System.out.println(discount);
        System.out.println(privacyPolicy);
    }
}
