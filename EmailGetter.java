public class EmailGetter implements PersonInfoGetter {
    @Override
    public String get(Person person) {
        return person.getEmail();
    }

    @Override
    public String infoName() {
        return "email";
    }

}
