package problem1;

public class Main {
    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Testlast1", "Testnew1",25));
        list.add(new Person("Testlast2", "Testnew2",25));
        list.add(new Person("Testlast3", "Testnew3",25));
        list.add(new Person("Testlast4", "Testnew4",25));
        list.add(new Person("Testlast5", "Testnew5",25));
        list.add(new Person("Testlast6", "Testnew6",25));
        list.add(new Person("Testlast7", "Testnew7",25));
        //System.out.println(list.toString());
        System.out.println(list.get(3).toString());
        System.out.println(list.find("Testlast4"));
        list.insert(new Person("Insertlast", "Insertfirst", 20), 4);
        //System.out.println(list.toString());
        list.remove("Testlast5");
        System.out.println(list.toString());

    }
}
