package example.fangsf.designpatterns.flyweight;

/**
 * Created by apple on 2018/12/16
 * Useful:
 */
public class TrainTicket implements Ticket {

    private String form;
    private String formTo;

    public TrainTicket(String form, String formTo) {
        this.form = form;
        this.formTo = formTo;
    }

    @Override
    public void showTicketInfo() {

        System.out.println("from "  + this.form + " to " + this.formTo +" --- " + this.toString());

    }


}
