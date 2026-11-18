class ClassA {
    ClassA(int x) {
        System.out.println("A constructor: " + x);
    }
}
class ClassB extends ClassA {
    ClassB(int x) {
        super(x + 10);
        System.out.println("B constructor: " + x);
    }
}
class ClassC extends ClassB {
    ClassC(int x) {
        super(x + 20);
        System.out.println("C constructor: " + x);
    }
}
class ConstructorOrder {
    public static void main(String[] args) {
        ClassC obj = new ClassC(10);
    }
}