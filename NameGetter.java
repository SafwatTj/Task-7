public class NameGetter implements PersonInfoGetter{
    @Override
    public String get(Person person) {
        return person.getfName() + " " + person.getlName();
    }

    @Override
    public String infoName() {
        return "first name + last name";
    }
}
