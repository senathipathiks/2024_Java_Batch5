package com.day8;
import java.util.*;
interface Foo {

    int x = 10;

}

public class bb{

    public static void main(String[] args) {

        Foo.x = 20;

        System.out.println(Foo.x);

    }

}




