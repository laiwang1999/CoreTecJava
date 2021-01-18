//package genericReflection;
//
//import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
//import java.lang.reflect.Type;
//import java.util.Scanner;
//
//public class GenericReflectionTest {
//    public static void main(String[] args) {
//        //read class name from command line args or user input
//        String name;
//        if (args.length > 0) name = args[0];
//        else {
//            try (Scanner in = new Scanner(System.in)) {
//                System.out.println("Enter class name (e.g.,java.util.Collections):");
//                name = in.next();
//            }
//        }
//        try {
//            //print generic info for class and public methods
//            Class<?> cl = Class.forName(name);
//            printClass(cl);
//            for (Method m : cl.getDeclaredMethods())
//                printMethod(m);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
////    public static void printClass(Class<?> cl) {
////        System.out.print(cl);
////        printTypes(cl.getTypeParameters(), "<", " ,", ">", true);
////        Type sc = cl.getGenericSuperclass();
////        if (sc != null) {
////            System.out.print(" extends ");
////            printType(sc, false);
////        }
////        printTypes(cl.getGenericInterfaces(), " implements ", ", ", "", false);
////        System.out.println();
////    }
////
////    public static void printMethod(Method m) {
////        String name = m.getName();
////        System.out.print(Modifier.toString(m.getModifiers()));
////        System.out.print(" ");
////        printTypes(m.get)
////    }
//
//    public static void printTypes(Type[] types, String pre, String sep, String suf, boolean isDefinition) {
//
//    }
//}
