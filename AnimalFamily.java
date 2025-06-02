public abstract class AnimalFamily extends AnimalClass{
    protected String rodentia;
    protected String carnivora;
    protected String primate;
    protected String squamata;
    protected String crocodilia;
    protected String testudines;
    protected String accipitridae;
    protected String anatidae;
    protected String passeriformes;
    protected String family;

    public AnimalFamily(String animalClass, String animalFamily){
        super(animalClass);
        switch (animalClass.toLowerCase()) {
            case "mammal":
                switch (animalFamily.toLowerCase()) {
                    case "rodentia":
                        this.rodentia = animalFamily;
                        break;
                    case "carnivora":
                        this.carnivora = animalFamily;
                        break;
                    case "primate":
                        this.primate = animalFamily;
                        break;
                    default:
                        break;
                }
            case "reptile":
                switch (animalFamily.toLowerCase()) {
                    case "squamata":
                        this.squamata = animalFamily;
                        break;
                    case "crocodilia":
                        this.crocodilia = animalFamily;
                        break;
                    case "testudines":
                        this.testudines = animalFamily;
                        break;
                    default:
                        break;
                }
            case "bird":
                switch (animalFamily.toLowerCase()) {
                    case "accipitridae":
                        this.accipitridae = animalFamily;
                        break;
                    case "anatidae":
                        this.anatidae = animalFamily;
                        break;
                    case "passeriformes":
                        this.passeriformes = animalFamily;
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        this.family = animalFamily;
    }

    public String getFamily() {
        return family;
    }
}