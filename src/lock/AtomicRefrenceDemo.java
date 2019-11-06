package lock;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicRefrenceDemo {

    public static void main(String[] args) {

        User z3 = new User("张三",22);
        User l4 = new User("李四",23);

        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(z3);
        System.out.println(atomicReference.compareAndSet(z3,l4)+"\t"+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(z3,l4)+"\t"+atomicReference.get().toString());

    }


    static class User {
        String userName;

        public String getUserName() {
            return userName;
        }

        public int getAge() {
            return age;
        }

        int age;

        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", age=" + age +
                    '}';
        }

        public User(String userName, int age) {
            this.userName = userName;
            this.age = age;
        }
    }
}
