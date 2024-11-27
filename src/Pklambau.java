public class Pklambau implements TellYourName{
    protected String name;

    public Pklambau(){
        this.name = "Phillipp";
    }

    @Override
    public void tell() {
        System.out.println(this.name);
    }
}