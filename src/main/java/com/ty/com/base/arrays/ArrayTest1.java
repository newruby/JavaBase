package com.ty.com.base.arrays;

import com.ty.com.base.ObjectOriented.polymorphism.Animal;

/**
 * created by TY on 2018/5/13.
 */
public class ArrayTest1 {
  public static void main(String[] args) {
      Animals [] animals = new Animals[4];
      Cat c1 = new Cat();
      Cat c2 = new Cat();
      Dog d1 = new Dog();
      Dog d2 = new Dog();

      animals[0] = c1;
      animals[1] = c2;
      animals[2] = d1;
      animals[3] = d2;

//需求：遍历数组 取出每个对象如果是Cat 调用eat 如果是Dog 调用move
      for(int i = 0; i < animals.length ; i++) {
          if(animals[i] instanceof Cat) {
              Cat cat = (Cat)animals[i];
              cat.eat();
          }else if (animals[i] instanceof Dog) {
              Dog dog = (Dog)animals[i];
              dog.move();
          }
     }
  }
}
class Animals {

}
class Cat extends Animals {
    public void eat() {
        System.out.println("Cats eat");
    }
}
class Dog extends Animals {
    public void move() {
        System.out.println("Dogs run");
    }

}

