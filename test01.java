import java.util.Random;
import java.util.logging.StreamHandler;

public class test01 {
    public static void main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("hahha");
        Employ e = new Employ();
        System.out.println(e.getClass().getName());
        Random gen = new Random();
        System.out.println(gen.getClass().getName());
        String className= "java.util.Random";
        Class c1 = Class.forName(className);
        Object c2 = Class.forName(className).newInstance();


    }

    public static class Employ{
        private int id;
        private String name;
        private int salary;

        public Employ() {
        }

        public Employ(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }
}
