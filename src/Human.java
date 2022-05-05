public class Human {
    private final String firstname;
    private final String lastname;
    private boolean isALive;
    private String phone;
    private Animal pet;
    private Car car;

    public Human(String firstname,String lastname, boolean isALive, String phone, Animal pet, Car car) {
        this.firstname =firstname;
        this.lastname = lastname;
        this.isALive = isALive;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isALive=" + isALive +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
