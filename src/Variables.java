public class Variables{
    public static String myClassVar="class or static variables";

    public static void main(String args[]){
        Variables obj = new Variables();
        Variables obj2 = new Variables();
        Variables obj3 = new Variables();

        //All three will display "Class or variables"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        //changing the value of static variable using obj2
        obj2.myClassVar="TalkMe";

        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

    }
}



