/*
This example taken from the java fundamentals course on pluralsight
 */

package static_members;

public class Passenger {
    private int freeBags;
    private int checkedBags;
    private double perBagFee;

    public Passenger() {
    }

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        setFreeBags(freeBags);
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        setCheckedBags(checkedBags);
    }

    private Passenger(double perBagFee) {
        setPerBagFee(perBagFee);
    }

    public int getFreeBags() {
        return freeBags;
    }

    private void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    private void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    private void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

}
