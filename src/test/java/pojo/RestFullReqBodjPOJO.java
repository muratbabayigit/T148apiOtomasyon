package pojo;

public class RestFullReqBodjPOJO {
    /*
     {
           "firstname" : "Ahmet",
           "lastname" : "Bulut",
           "totalprice" : 500,
           "depositpaid" : false,
           "bookingdates" : {
               "checkin" : "2021-06-01",
               "checkout" : "2021-06-10"
           },
           "additionalneeds" : "wi-fi"
       }
     */
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private RestFullBookingdatesPOJO bookingdates;
    private  String additionalneeds;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public RestFullBookingdatesPOJO getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(RestFullBookingdatesPOJO bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAddionalneeds() {
        return additionalneeds;
    }

    public void setAddionalneeds(String addionalneeds) {
        this.additionalneeds = addionalneeds;
    }

    public RestFullReqBodjPOJO(String firstname, String lastname, int totalprice, boolean depositpaid, RestFullBookingdatesPOJO bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    public RestFullReqBodjPOJO() {
    }

    @Override
    public String toString() {
        return "Rezervasyon Bilgileriniz: \n" +
                "Firstname : " + firstname +"\n"+
                "Lastname : " + lastname + "\n" +
                "Totalprice : " + totalprice +"\n"+
                "DepositPaid : " + depositpaid +"\n"+
                "Bookingdates :" + bookingdates +"\n"+
                "Additionalneeds :'" + additionalneeds ;
    }
}
