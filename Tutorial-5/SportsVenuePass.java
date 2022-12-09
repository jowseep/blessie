public class SportsVenuePass {

    String name;
    private boolean used = false;
    private int passId;
    static int lastPassId = 1000;

    public SportsVenuePass(String name) {
        this.name = name;
        this.used = false;
        lastPassId++;
        passId = lastPassId;
    }

    public boolean useThisPass(int passId) {
        return used = true;
    }

    public boolean isUsed() {
        return used;
    }

    public int getPassId() {
        return passId;
    }
}