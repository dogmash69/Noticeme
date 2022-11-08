public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    public String getName() {
        return this.firstname;
    }
    public boolean getAware() {
        return this.aware;
    }
    public void setName(String firstname) {
        this.firstname = firstname;
    }
    public void setAware(Boolean aware) {
        this.aware = aware;
    }
    public String whoAmI(){
        if (this.aware){
            return "Je m'appelle " + this.firstname + " et je suis aware";
        }
        else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}
