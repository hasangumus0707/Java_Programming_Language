/*Static i anlamak icin olusturuldu*/

public class Car {
// eger companyName değiştirilemez olsun istiyorsan static in önüne yada arkasına final koy
    public  static String companyName = "Ferrari";
    public int productionYear;
    public String origin;
    static int counter;


    public Car(int productionYear , String origin)
    {
        this.productionYear = productionYear;
        this.origin = origin;
        counter++;
    }
}
