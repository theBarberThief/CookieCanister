public class CookieCanister {

    private int maxFill;
    private String cookieType;
    private int cookieAmount;
    private boolean isOpen;

    public CookieCanister(int theMaxFill, String theCookieType) {
        maxFill = theMaxFill;
        cookieType = theCookieType;
        cookieAmount = 0;
        isOpen = false;
    }

    public int getMaxFill() {
        return maxFill;
    }

    public String getCookieType() {
        return cookieType;
    }

    public int getCookieAmount() {
        return cookieAmount;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean myIsOpen) {
        isOpen = myIsOpen;
    }

    public void fillCapacity() {
        cookieAmount = maxFill;
    }

    public void addCookie(int toAdd) {
        if (toAdd > maxFill) {
            cookieAmount = maxFill;
        } else {
            cookieAmount += toAdd;
        }
    }

    public void dispenseCookie(int toDispense) {
        if (toDispense > maxFill) {
            cookieAmount = 0;
        } else {
            cookieAmount -= toDispense;
        }
    }

    public String toString() {
        return "Your Cookie Canister: \nCookie Type:" + getCookieType() + "\nMax Capacity: " + getMaxFill() + "\nNumber of Cookies in Canister: " + getCookieAmount() + "\nCookie Canister Open/Closed: " + getIsOpen();
    }
}

