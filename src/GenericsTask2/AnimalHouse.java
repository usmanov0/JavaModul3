package GenericsTask2;

public class AnimalHouse <T extends Animal>{
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }
    public T getAnimal(){
        return animal;
    }
}
