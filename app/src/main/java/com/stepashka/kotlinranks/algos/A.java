package com.stepashka.kotlinranks.algos;

public class A {
    int a;
    private String b;

    public A(int a, String b)
    {
        this.a=a;
        this.b=b;
    }
    public void get()
    {
        print();
    }
    public void print()
    {
        System.out.println(b+" "+a);
    }
}
class B extends A{
    public B(int a, String b) {
        super(a, b);
    }
    public static void main(String []aa)
    {
        A a=new A(100,"Modifier");
        a.get();
    }

}


