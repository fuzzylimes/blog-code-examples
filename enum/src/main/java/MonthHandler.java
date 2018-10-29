import java.util.Arrays;

public class MonthHandler {

    public int enumInIfStatement(Month month) {
        if(month == Month.January) {
            return 1;
        }else if(month == Month.February) {
            return 2;
        }else if(month == Month.March) {
            return 3;
        }else if(month == Month.April) {
            return 4;
        }else if(month == Month.May) {
            return 5;
        }else if(month == Month.June) {
            return 6;
        }else if(month == Month.July) {
            return 7;
        }else if(month == Month.August) {
            return 8;
        }else if(month == Month.September) {
            return 9;
        }else if(month == Month.October) {
            return 10;
        }else if(month == Month.November) {
            return 11;
        }else if(month == Month.December) {
            return 12;
        } else {
            throw new IllegalArgumentException("Month not supported");
        }
    }

    public int enumInSwitchStatement(Month month) {
        switch (month) {
            case January: return 1;
            case February: return 2;
            case March: return 3;
            case April: return 4;
            case May: return 5;
            case June: return 6;
            case July: return 7;
            case August: return 8;
            case September: return 9;
            case October: return 10;
            case November: return 11;
            case December: return 12;
            default: throw new IllegalArgumentException("This isn't right");
        }
    }

    public boolean valueInEnum(String value) {
        Month month = Arrays.stream(Month.values()).filter(e -> e.name().equalsIgnoreCase(value)).findAny().orElse(null);
        return !(month == null);
    }
}
