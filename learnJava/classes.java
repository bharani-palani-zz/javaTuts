class Parent {
    int a;
    int b;
    double result;

    public void perform() {
        result = Math.pow(a, b);
    }
}

class Child {
    public static void main(String [] args) {
        // normal class referencing
        Parent obj = new Parent();
        obj.a = 2;
        obj.b = 32;
        obj.perform();
        System.out.println(obj.result);

        // annonymous class
        Parent obj2 = new Parent() {
            public void perform() {
                System.out.println("anonymous");
            }
        };
        obj2.perform();
    }
}