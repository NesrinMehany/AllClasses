package HomeWork;

/*
public class Practice3 {
}
    class A{

        public int i;

        private int j;

    }

    class B extends A{

        void display(){

            super.j = super.i + 1;

            System.out.println(super.i + " " + super.j);

        }

    }

    class Inheritance {

        public static void main(String args[]){

            B obj = new B();

            obj.i=1;

            obj.j=2;

            obj.display();

        }

    }*/
/*
class T {
    int t = 20;
}
class M {
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println(t1.t);
    }
}*/







class parent {
    String name = "Nes";

    void hi() {

        System.out.println("hi");
    }
}
class Child extends parent{
    @Override
    void hi(){
        super.hi();
        System.out.println("hey");
    }
    public static void main(String[] args) {

    }

}
class test1 extends parent{

    public static void main(String[] args) {
        Child c=new Child();
c.hi();

    }
}