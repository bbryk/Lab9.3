package atm;

public class DefaultBill implements  Bill{
    private final int billAmount;
    private  Bill next;

    public DefaultBill(int billAmount){
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill next) {
        this.next = next;
    }

    @Override
    public void process(int amount) throws IllegalAccessException {
        // add exception that would be raised here if th amount could not be handled

        if (next != null){
            next.process(amount % billAmount);
        }else if(amount % billAmount !=0){
            throw new IllegalAccessException();
        }
        System.out.println("Please receive " + amount/billAmount + " of " + billAmount + " UAH bills!!!!!");


    }
}
