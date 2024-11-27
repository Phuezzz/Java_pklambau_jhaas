public class Jeberhar implements TellYourName{
    protected String name;

    public Jeberhar(){
        this.name = "Johannes";
    }


    @Override
    public void tell() {
        System.out.println(this.name);
    }
}
