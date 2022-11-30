class Demo {       //  class is a keyword to create a class and Demo is name of the class
    int a = 5;          
    int b = 6;

    void add() {            // it is a method that perform an addition and print the output
        int c = a + b;
        System.out.println(c);
    }
}

class ClassAndObj {           // main class where we can create an object and call the method
    public static void main(String[] args) {         // main function of the program 
        Demo Obj1 = new Demo();        // classname objectname=new classname(); used to create any obj
        Obj1.add();                   //  calling the method of the created class 
    }

}
