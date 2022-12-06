import java.util.Enumeration;

public abstract class Statement {
    public abstract String startResultStr(Customer aCustomer);

    public abstract String showFiguresStr(Rental each);

    public abstract String amountOwedStr(Customer aCustomer);

    public abstract String amountEarnedStr(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = startResultStr(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += showFiguresStr(each);
        }
        //add footer lines
        result += amountOwedStr(aCustomer);
        result += amountEarnedStr(aCustomer);
        return result;
    }
}