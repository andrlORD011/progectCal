package HashCode1;

import java.util.HashSet;
import java.util.Set;

public class Starter {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(11L, "name");
        MyClass m2 = new MyClass(11L, "name");
        Set<MyClass> set = new HashSet<>();
        System.out.println("1");
        set.add(m1);
        System.out.println("2");
        set.add(m2);
        System.out.println(set.size());
        }

    }



