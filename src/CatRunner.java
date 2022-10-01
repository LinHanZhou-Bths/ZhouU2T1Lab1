public class CatRunner {
    public static void main(String[] args){
        String name1 = "bob";
        String name2 = "dylan";

        Cat cat1 = new Cat("bob", 4, 12.65);
        Cat cat2 = new Cat(name2, 5, 13.45);
        cat1.introduce();
        cat1.printCatInfo();
        cat2.introduce();
        cat2.printCatInfo();
    }
}
