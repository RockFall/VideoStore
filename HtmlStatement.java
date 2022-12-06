import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String startResultStr(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
    }

    public String showFiguresStr(Rental each){
        return each.getMovie().getTitle()+ ": " +
        String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String amountOwedStr(Customer aCustomer){
        return "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String amountEarnedStr(Customer aCustomer){
        return "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    }

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