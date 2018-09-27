public class CookieCanisterTester {
    public static void main(String[] args){
        CookieCanister cookie1 = new CookieCanister(10, "sugar");

        cookie1.addCookie(5);
        System.out.println(cookie1.toString());
    }
}
