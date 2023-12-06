package TuesdayDec05.StudentExercise;

public class Address {
    String streetNo;
    String streetName;
    String postalCode;
    String country;

    public Address(String streetNo, String streetName, String postalCode, String country) {
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address: " + '\'' +
                "streetNo='" + streetNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'';
    }
}
