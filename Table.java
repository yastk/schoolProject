import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

/**
 * Created by 17YTariq on 28/03/2017.
 */

// Table class, which is meant to hold the variables for the table
public class Table {
    private final SimpleStringProperty rFullName;
    private final SimpleStringProperty rEmailAddress;
    private final SimpleIntegerProperty rPhoneNumber;
    private final SimpleStringProperty rDepartment;
    private final SimpleStringProperty rActivityTitle;
    private final SimpleStringProperty rEventObjective;
    private final SimpleStringProperty rActivityType;
    private final SimpleStringProperty reventSynopsis;
    private final SimpleIntegerProperty rExpectedNumberOfAttendees;
    private final SimpleStringProperty rSpecialRequests;
    private final SimpleStringProperty rexpectedStartTime;
    private final SimpleStringProperty rexpectedEndTime;
    private final SimpleStringProperty rdatePicker;

    public Table(SimpleStringProperty rFullName, SimpleStringProperty rEmailAddress, SimpleIntegerProperty rPhoneNumber,
                 SimpleStringProperty rDepartment, SimpleStringProperty rActivityTitle, SimpleStringProperty rEventObjective,
                 SimpleStringProperty rActivityType, SimpleStringProperty reventSynopsis, SimpleIntegerProperty rExpectedNumberOfAttendees, SimpleStringProperty rSpecialRequests,
                 SimpleStringProperty rexpectedStartTime, SimpleStringProperty rexpectedEndTime, SimpleStringProperty rdatePicker) {
        this.rFullName = rFullName;
        this.rEmailAddress = rEmailAddress;
        this.rPhoneNumber = rPhoneNumber;
        this.rDepartment = rDepartment;
        this.rActivityTitle = rActivityTitle;
        this.rEventObjective = rEventObjective;
        this.rActivityType = rActivityType;
        this.reventSynopsis = reventSynopsis;
        this.rExpectedNumberOfAttendees = rExpectedNumberOfAttendees;
        this.rSpecialRequests = rSpecialRequests;
        this.rexpectedStartTime = rexpectedStartTime;
        this.rexpectedEndTime = rexpectedEndTime;
        this.rdatePicker = rdatePicker;
    }

    public String getrFullName() {
        return rFullName.get();
    }

    public SimpleStringProperty rFullNameProperty() {
        return rFullName;
    }

    public void setrFullName(String rFullName) {
        this.rFullName.set(rFullName);
    }

    public String getrEmailAddress() {
        return rEmailAddress.get();
    }

    public SimpleStringProperty rEmailAddressProperty() {
        return rEmailAddress;
    }

    public void setrEmailAddress(String rEmailAddress) {
        this.rEmailAddress.set(rEmailAddress);
    }

    public int getrPhoneNumber() {
        return rPhoneNumber.get();
    }

    public SimpleIntegerProperty rPhoneNumberProperty() {
        return rPhoneNumber;
    }

    public void setrPhoneNumber(int rPhoneNumber) {
        this.rPhoneNumber.set(rPhoneNumber);
    }

    public String getrDepartment() {
        return rDepartment.get();
    }

    public SimpleStringProperty rDepartmentProperty() {
        return rDepartment;
    }

    public void setrDepartment(String rDepartment) {
        this.rDepartment.set(rDepartment);
    }

    public String getrActivityTitle() {
        return rActivityTitle.get();
    }

    public SimpleStringProperty rActivityTitleProperty() {
        return rActivityTitle;
    }

    public void setrActivityTitle(String rActivityTitle) {
        this.rActivityTitle.set(rActivityTitle);
    }

    public String getrEventObjective() {
        return rEventObjective.get();
    }

    public SimpleStringProperty rEventObjectiveProperty() {
        return rEventObjective;
    }

    public void setrEventObjective(String rEventObjective) {
        this.rEventObjective.set(rEventObjective);
    }

    public String getrActivityType() {
        return rActivityType.get();
    }

    public SimpleStringProperty rActivityTypeProperty() {
        return rActivityType;
    }

    public void setrActivityType(String rActivityType) {
        this.rActivityType.set(rActivityType);
    }

    public String getReventSynopsis() {
        return reventSynopsis.get();
    }

    public SimpleStringProperty reventSynopsisProperty() {
        return reventSynopsis;
    }

    public void setReventSynopsis(String reventSynopsis) {
        this.reventSynopsis.set(reventSynopsis);
    }

    public int getrExpectedNumberOfAttendees() {
        return rExpectedNumberOfAttendees.get();
    }

    public SimpleIntegerProperty rExpectedNumberOfAttendeesProperty() {
        return rExpectedNumberOfAttendees;
    }

    public void setrExpectedNumberOfAttendees(int rExpectedNumberOfAttendees) {
        this.rExpectedNumberOfAttendees.set(rExpectedNumberOfAttendees);
    }

    public String getrSpecialRequests() {
        return rSpecialRequests.get();
    }

    public SimpleStringProperty rSpecialRequestsProperty() {
        return rSpecialRequests;
    }

    public void setrSpecialRequests(String rSpecialRequests) {
        this.rSpecialRequests.set(rSpecialRequests);
    }

    public String getRexpectedStartTime() {
        return rexpectedStartTime.get();
    }

    public SimpleStringProperty rexpectedStartTimeProperty() {
        return rexpectedStartTime;
    }

    public void setRexpectedStartTime(String rexpectedStartTime) {
        this.rexpectedStartTime.set(rexpectedStartTime);
    }

    public String getRexpectedEndTime() {
        return rexpectedEndTime.get();
    }

    public SimpleStringProperty rexpectedEndTimeProperty() {
        return rexpectedEndTime;
    }

    public void setRexpectedEndTime(String rexpectedEndTime) {
        this.rexpectedEndTime.set(rexpectedEndTime);
    }

    public String getRdatePicker() {
        return rdatePicker.get();
    }

    public SimpleStringProperty rdatePickerProperty() {
        return rdatePicker;
    }

    public void setRdatePicker(String rdatePicker) {
        this.rdatePicker.set(rdatePicker);
    }
}
