package HomeWork;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class C28HWTask4Map {

    public static void main(String[] args) {
        Personel p1 = new Personel("Mark", "William", 30, 5000);
        Personel p2 = new Personel("Frrank", "Jim", 33, 5600);
        Personel p3 = new Personel("Mac", "Alex", 42, 7600);


        TreeMap<Integer, Personel> allPersonels= new TreeMap<>();
        allPersonels.put(100,p1);
        allPersonels.put(200,p2);
        allPersonels.put(300,p3);

      Collection<Personel> objDetails= allPersonels.values();

      for(Personel obj:objDetails){
          System.out.println(obj);
      }



    }
}

class Personel {
    private String name;
    private String lastName;
    private int age;

    private double salary;

    public Personel(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "personel{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
