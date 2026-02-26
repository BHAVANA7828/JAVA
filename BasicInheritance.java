class Animal{
    void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Dog barks");
    }
}
class BasicInheritance{
    public static void main(String[] args) {
        Animal ob= new Animal();
        Dog obj = new Dog();
        ob.speak();
        obj.speak();
    }
}

