package sample;


import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import javafx.scene.control.Button;


/**
 * Created by 17YTariq on 24/03/2017.
 */
public class Request {
    private String requesterFullName;
    private String requesterEmailAddress;
    private int requesterPhoneNumber;
    private String requesterDepartment;
    private Button requestAdd;
    private Button seePreviousRequests;
    private String requestActivityTitle;
    private String requestEventObjective;
    private String requestActivityType;
    private String eventSynopsis;
    private int requestExpectedNumberOfAttendees;
    private String requestSpecialRequests;
    private String expectedStartTime;
    private String expectedEndTime;
    private String datePicker;

    public Request(String requesterFullName, String requesterEmailAddress, int requesterPhoneNumber,
                   String requesterDepartment,String requestActivityTitle, String requestEventObjective,
                   String requestActivityType,String eventSynopsis, int requestExpectedNumberOfAttendees,
                   String requestSpecialRequests, String expectedStartTime, String expectedEndTime, String datePicker) {
        this.requesterFullName = requesterFullName;
        this.requesterEmailAddress = requesterEmailAddress;
        this.requesterPhoneNumber = requesterPhoneNumber;
        this.requesterDepartment = requesterDepartment;
        this.requestActivityTitle = requestActivityTitle;
        this.requestEventObjective = requestEventObjective;
        this.requestActivityType = requestActivityType;
        this.eventSynopsis = eventSynopsis;
        this.requestExpectedNumberOfAttendees = requestExpectedNumberOfAttendees;
        this.requestSpecialRequests = requestSpecialRequests;
        this.expectedStartTime = expectedStartTime;
        this.expectedEndTime = expectedEndTime;
        this.datePicker = datePicker;
    }

    public Request() {

    }

    public String getRequesterFullName() {
        return this.requesterFullName;
    }

    public void setRequesterFullName(String requesterFullName) {
        this.requesterFullName = requesterFullName;
    }

    public String getRequesterEmailAddress() {
        return requesterEmailAddress;
    }

    public void setRequesterEmailAddress(String requesterEmailAddress) {
        this.requesterEmailAddress = requesterEmailAddress;
    }

    public int getRequesterPhoneNumber() {
        return requesterPhoneNumber;
    }

    public void setRequesterPhoneNumber(int requesterPhoneNumber) {
        this.requesterPhoneNumber = requesterPhoneNumber;
    }

    public String getRequesterDepartment() {
        return requesterDepartment;
    }

    public void setRequesterDepartment(String requesterDepartment) {
        this.requesterDepartment = requesterDepartment;
    }

    public Button getRequestAdd() {
        return requestAdd;

    }

    public void setRequestAdd(Button requestAdd) {
        this.requestAdd = requestAdd;
        /** Request request = new Request();
         request.requesterFullName(requesterFullName.getText());
         request.requesterEmailAddress(requestEmailAddress.getText());
         request.setID(Integer.parseInt(IDInput.getText()));
         request.setPhoneNum(Integer.parseInt(phoneNumInput.getText()));
         request.setCountryFlyingFrom(countryFlyingFromInput.getText());
         request.setCompanyWorkingFor(companyWorkingForInput.getText());
         request.setHotelStayingAt(hotelStayingAtInput.getText());
         request.setNationality(nationalityInput.getText());
         request.setPassportNum(passportNumInput.getText());
         table.getItems().add(request); **/
    }


    public Button getSeePreviousRequests() {
        return seePreviousRequests;
    }

    public void setSeePreviousRequests(Button seePreviousRequests) {
        this.seePreviousRequests = seePreviousRequests;
    }

    public String getRequestActivityTitle() {
        return requestActivityTitle;
    }

    public void setRequestActivityTitle(String requestActivityTitle) {
        this.requestActivityTitle = requestActivityTitle;
    }

    public String getRequestEventObjective() {
        return requestEventObjective;
    }

    public void setRequestEventObjective(String requestEventObjective) {
        this.requestEventObjective = requestEventObjective;
    }

    public String getRequestActivityType() {
        return requestActivityType;
    }

    public void setRequestActivityType(String requestActivityType) {
        this.requestActivityType = requestActivityType;
    }

    public String getEventSynopsis() {
        return eventSynopsis;
    }

    public void setEventSynopsis(String eventSynopsis) {
        this.eventSynopsis = eventSynopsis;
    }

    public int getRequestExpectedNumberOfAttendees() {
        return requestExpectedNumberOfAttendees;
    }

    public void setRequestExpectedNumberOfAttendees(int requestExpectedNumberOfAttendees) {
        this.requestExpectedNumberOfAttendees = requestExpectedNumberOfAttendees;
    }

    public String getRequestSpecialRequests() {
        return requestSpecialRequests;
    }

    public void setRequestSpecialRequests(String requestSpecialRequests) {
        this.requestSpecialRequests = requestSpecialRequests;
    }

    public String getExpectedStartTime() {
        return expectedStartTime;
    }

    public void setExpectedStartTime(String expectedStartTime) {
        this.expectedStartTime = expectedStartTime;
    }

    public String getExpectedEndTime() {
        return expectedEndTime;
    }

    public void setExpectedEndTime(String expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
    }

    public String getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(String datePicker) {
        this.datePicker = datePicker;
    }

    public static void ArrayList(){
        Request request;
        request = new Request("Yasin", "yas2ktk@gmail.com",123415, "finance",
                "football","play football", "sport", "-", 22 ,"-", "1200", "200", "12th of March");

    }


}
