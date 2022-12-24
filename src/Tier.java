public class Tier {
    String tierart;
    String tiername;
    public Tier(String tierart, String tiername) {
        this.tierart = tierart;
        this.tiername = tiername;
    }
    public void setTierart(String tierart) {
        this.tierart = tierart;
    }
    public void setTiername(String tiername) {
        this.tiername = tiername;
    }

    public String getTierart() {
        return tierart;
    }

    public String getTiername() {
        return tiername;
    }

    public void bellen(){
        System.out.println(getTiername() + ": WuffWuff");
    }
}
