package ex1_4;

public class ex1 {
    static void main(String[] args){
        Animals[] animalArray = new Animals[2];

        // tao doi tuong dog va cat
        Dogs dog1 = new Dogs("Buddy",3,"Golden Retriever");
        Cats cat1 = new Cats("Whisker", 2, "Ghi");

        // them vao mang
        animalArray[0] = dog1;
        animalArray[1] = cat1;

        for(Animals a : animalArray){
            a.displayInfo();
            System.out.println("am thanh: "+a.makeSound());
            System.out.println();
        }
    }
}
