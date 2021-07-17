package restassured;

public class StringExample {
    public static void main(String[] args) {
        String s= "{\"suiteDescription\":\"FormService_API_Functional_Test\",\"suiteId\":\"\",\"suiteName\":\"FormService_API_Functional\",\"tag\":\"\",\"team\":\"COBRA\",\"product\":\"All\",\"module\":\"\",\"submodule\":\"\",\"testManagerId\":\"\",\"testPlanId\":\"\",\"domain\":\"\",\"numberOfThreads\":\"\",\"rampUpPeriod\":\"\",\"loopCount\":\"\",\"test\":[1885,1725]} ";
        String s_new= s.split("\"test:\"")[1];
        System.out.println(s_new);
    }
}
