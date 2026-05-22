package dsa.Strings;

public class Main {
    static void main() {
//        String is datatype, name is reference variable, "Agneesh" is object
        String name = "Agneesh";
        System.out.println(name);

//        Here the reference variables will be different but as they both contains "Hello" they both will point to the same object
//        reference variables are stored into stack memory and the objects (here "Hello") is stored in the heap memory
//        String has a String pool in the heap memory and whenever we create Strings like this it is stored in the String pool
//        and both the objects are same then, both the reference variables are pointing to the same object in the String pool
        String a = "Hello";
        String b = "Hello";
//        This returns true when the both the reference variables are pointing to the same object. It does not care about the values.
        System.out.println(a == b);

//        Here though the values are same for x and y it is returning false because when we create string using new keyword,
//        it does not create the string objects in the String pool but in the heap memory. so both the variables are pointing
//        to different objects
        String x = new String("Sneha");
        String y = new String("Sneha");
        System.out.println(x == y);

//        So to compare only the values we use equals() method. here in both cases it is checking only the value. so both returns true
        System.out.println(a.equals(b));
        System.out.println(x.equals(y));

//        Also the Strings are immutable. So you cannot change the original object. If you change something it will create a new object
//        When we create str = "Asmit" it created the object but when we change the value it does not change the value actually,
//        but it created a new object for str

//        It is because of security reasons. as multiple reference variables are pointing to the same object, if for one variable
//        the object value is changed then it will be changed for all the reference variables. So for security reasons String is immutable.
        String str = "Asmit";
        str = "Sneha";

    }
}
