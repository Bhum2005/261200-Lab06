public class Shark extends Fish{
    public void swim(){
        System.out.println("Shark is swimming fast!");
    }
    protected void eat(Fish fish){
        System.out.println(this.toString() + " is eating " + fish.toString());
    }
}
