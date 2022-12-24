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

    /**
     * Version ist veraltet und sollte nicht mehr verwendet werden.
     * Stattdessen sollte die Methode bellen verwendet werden.
     */
    @Deprecated
    public void bellen(){
        System.out.println(getTiername() + ": WuffWuff");
    }

    /**
     * Die Methode gibt das übergebene Tierspezifische Geräusche auf
     * der Konsole aus.
     * @param Geräusch String
     *
     */
    public void Tiergeräusch(String Geräusch){
        System.out.println(getTiername() + ": " + Geräusch);
    }
}
