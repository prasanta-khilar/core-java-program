package com.prasanta.basics.stream;

@FunctionalInterface
interface CustomFunctionalInterface {
    String costum(String str);
    default int customDefault(){
        return 10+20;
    }
    static int customStatic(){
        return 20;
    }
}
class AccessCustomInterface {
    public static void main(String[] args) {
        CustomFunctionalInterface custom =
                str -> "Hello " + str;

        System.out.println(custom.costum("World"));

        // default method
        System.out.println(custom.customDefault());

        // static method
        System.out.println(CustomFunctionalInterface.customStatic());
    }
}
