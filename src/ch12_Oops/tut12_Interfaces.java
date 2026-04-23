package ch12_Oops;
// Herbivore.java
interface Herbivore {
    void eatPlants();
}
// Carnivore.java
interface Carnivore {
    void eatMeat();
}
// Dog.java
class Dog1 implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Dog can eat plants.");
    }
    public void eatMeat() {
        System.out.println("Dog eats meat.");
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,down,left,right,diagonal(in all Direction)");
    }
}
//Rook = Haathi
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up,down,left,right,diagonal(By 1 steps)");
    }
}
public class tut12_Interfaces {
    public static void main(String[] args) {
        Queen Q=new Queen();
        Q.moves();
        Dog1 d = new Dog1();
        d.eatPlants();
        d.eatMeat();
    }
}
