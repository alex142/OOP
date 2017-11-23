public class Person {

    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        Person one = new Person(16, "John");

        try {
            int res = 10/0;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            Thread.sleep(1000);
            System.out.println(e.toString());
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Person two = new Person(22, "Doe");
        Person three = new Person(22, "Doe");
        Person four = new Person(22, null);

        System.out.println(one.equals(two));
        System.out.println(two.equals(three));
        System.out.println("One: " + one.hashCode() + "; Two: " + two.hashCode() + "; Three: " + three.hashCode());
        System.out.println(four.hashCode());

    }
}
