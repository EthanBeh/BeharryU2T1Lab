public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bouba", 5, 7 );
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Kiki",5, 12);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
