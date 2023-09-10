public class Car {
    private String brandCar;
    private String modelCar;
    private int weightCar;

    public Car(){}
    public Car (String brandCar, String modelCar, int weightCar){
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.weightCar = weightCar;
    }
    public String getBrandCar(){
        return  brandCar;
    }
    public void setBrandCar(String brandCar){
        this.brandCar = brandCar;
    }
    public  String getModelCar(){
        return modelCar;
    }
    public void  setModelCar(String modelCar){
        this.modelCar = modelCar;
    }
    public int getWeightCar(){
        return weightCar;
    }
    public void setWeightCar(int weightCar){
        this.weightCar = weightCar;
    }

    @Override
        public  String toString(){
        return "Auto " + this.getBrandCar() + " model " + this.getModelCar() + " waga: " + this.getWeightCar();
    }
}
