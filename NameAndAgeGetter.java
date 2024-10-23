public class NameAndAgeGetter implements PersonInfoGetter{
    @Override
    public String get(Person person) {
        return person.getfName() + " " + person.getAge();
    }

    @Override
    public String infoName() {
        return "first name + age";
    }
}
