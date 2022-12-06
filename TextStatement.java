public class TextStatement extends Statement {
    public String startResultStr(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
        "\n";
    }

    public String showFiguresStr(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" +
        String.valueOf(each.getCharge()) + "\n";
    }

    public String amountOwedStr(Customer aCustomer){
        return "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String amountEarnedStr(Customer aCustomer){
        return "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    }
}