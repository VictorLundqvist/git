public class CowSay{

    private String cowName;
    private int cowWeight;
    private String whatDoesTheCowSay;

    public CowSay(){
    }

    public CowSay(String cowName, int cowWeight){
        this.cowName = cowName;
        this.cowWeight= cowWeight;
    }
    public CowSay(String whatDoesTheCowSay){
        this.whatDoesTheCowSay = whatDoesTheCowSay;
    }

    public String getWhatDoesTheCowSay() {
        return whatDoesTheCowSay;
    }

    public void setWhatDoesTheCowSay(String whatDoesTheCowSay) {
        this.whatDoesTheCowSay = whatDoesTheCowSay;
    }
    public String getCowName() {
        return cowName;
    }

    public int getCowWeight() {
        return cowWeight;
    }

    @Override
    public String toString(){
        return String.format(getWhatDoesTheCowSay());
    }


}
