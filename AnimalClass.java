public abstract class AnimalClass implements insert{
    protected String mammal;
    protected String reptile;
    protected String bird;
    protected String animalClass;
    public AnimalClass (String animalClass){
        if(animalClass.equalsIgnoreCase("Mammal")){
            this.mammal = animalClass;
        }else if(animalClass.equalsIgnoreCase("Reptile")){
            this.reptile = animalClass;
        }else{
            this.bird = animalClass;
        }
        this.animalClass = animalClass;
    }

    public String getAnimalClass() {
        return animalClass;
    }
}