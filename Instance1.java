class Animal {
    void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Cat meows");
    }
}
class Instance1{
    public static void main(String[] args) {
        Animal ob[]= new Animal[3];
        Dog d = new Dog();   //dog class obj
        // condition to check instance of Animal class
        if(d instanceof Animal)
                ob[0]=d;    // passing child obj to parent
        Cat c = new Cat();  //cat class obj
        if(d instanceof Animal)
                ob[1]=c;
        Animal a = new Animal();  //Animal class obj
        if(d instanceof Animal)
                ob[2]=a;
            for(Animal obj:ob){
                if(obj instanceof Animal)
                    obj.speak();
            }

        }
        }
    
