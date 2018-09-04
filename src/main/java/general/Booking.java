package general;

import lombok.Data;

@Data
public class Booking {

    private String CheckIn;
    private String CheckOut;
    private String Adults;
    private String Children;


    public Booking() {
        this.CheckIn = "01.09.2018";
        this.CheckOut = "07.09.2018";
        this.Adults  = "2";
        this.Children = "2";
    }

}
