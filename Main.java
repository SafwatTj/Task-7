import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Oleg", "Ivanov", 30, "oivanov@mail.com", "+49 111-222-120"),
                new Person("Lena", "Ivanova", 31, "lena_ivanova@mail.com", "+49 111-222-121"),
                new Person("Nikita", "Ivanov", 30, "oivanov@mail.com", "+49 111-222-122"),
                new Person("Jack", "Vorobei", 10, "pirat@mail.com", "+49 111-222-123"),
                new Person("John", "Travolta", 25, "travolta@mail.com", "+49 111-222-124"),
                new Person("Nick", "Nickson", 29, "nick@mail.com", "+49 111-222-125"),
                new Person("Mike", "Tyson", 16, "tyson@mail.com", "+49 111-222-126"),
                new Person("Irina", "Turbaza", 35, "ira@mail.com", "+49 111-222-127")
        );

        Scanner scanner = new Scanner(System.in);

        PersonInfoGetter[] personInfoGetter = {
                new EmailGetter(),
                new PhoneGetter(),
                new NameGetter(),
                new NameAndAgeGetter()
        };

        System.out.println("Введите какую информацию вы хотите получить:");
        for (int i = 0; i < personInfoGetter.length; i++) {
            System.out.println(i + " " +  personInfoGetter[i].infoName());
        }

        int select = scanner.nextInt();
        PersonInfoGetter selectedGetter = personInfoGetter[select];


        System.out.println(" List :" + selectedGetter.infoName());
        System.out.println(getInfo(people,selectedGetter));


    }


    public static List<String> getInfo(List<Person> people, PersonInfoGetter personInfoGetter){
        List<String> result = new ArrayList<>();
        for (Person person:people){
            result.add(personInfoGetter.get(person));
        }
        return result;
    }




}
