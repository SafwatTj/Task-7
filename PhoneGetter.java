public class PhoneGetter implements PersonInfoGetter{
    @Override
    public String get(Person person) {
        return person.getPhone();
    }

    @Override
    public String infoName() {
        return "phone";
    }
}
