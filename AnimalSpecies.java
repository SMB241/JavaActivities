public abstract class AnimalSpecies extends AnimalFamily{
    protected String species;


    public AnimalSpecies( String animalClass, String family, String species){
        super(animalClass, family);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}