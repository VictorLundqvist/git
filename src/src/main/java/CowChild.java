public class CowChild extends CowSay {
    private int month;

    private String whatDoesTheCowChildSay;

    public CowChild(){
    }
    public CowChild(String cowName, int cowWeight, int month){
        super(cowName, cowWeight);
        this.month = month;
    }
    public int getMonth() {
        return month;
    }

    public String getWhatDoesTheCowChildSay() {
        return whatDoesTheCowChildSay;
    }

    public void setWhatDoesTheCowChildSay(String whatDoesTheCowChildSay) {
        this.whatDoesTheCowChildSay = whatDoesTheCowChildSay;
    }

    @Override
    public String toString(){
        return String.format("%s%s","Lillen säger ",getWhatDoesTheCowChildSay());
    }


} //kossa
