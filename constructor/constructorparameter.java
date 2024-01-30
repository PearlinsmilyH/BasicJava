public class constructorparameter {
    int modelYear;
    String modelName;

    public constructorparameter (int year, String name) {
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        constructorparameter  myCar = new constructorparameter (1969,"audi");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}


