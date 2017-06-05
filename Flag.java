
public class Flag
{
    public double radius;
    public double volume;
    public double surfaceArea;
    
    public void addAir(double amount){
         this.volume = this.volume + amount;
         System.out.print("addAir "+"\t");
    }
      public double getRadius(){
      double rad = (double) (3*this.volume)/(4*Math.PI);
      double power =(double) 1/3;
      radius = Math.pow(rad,power);
      System.out.print("getRadius "+"\t");
      return radius;
    }
    public double getVolume(){
         this.volume =  volume;
         System.out.print("getVolume"+"\t");
        return this.volume;
    }
    public double getSurfaceArea(){
         surfaceArea = (double)(4*Math.PI*Math.pow(this.radius,2));
         System.out.print("SurfaceArea "+"\t");
        return surfaceArea;
    }

}
