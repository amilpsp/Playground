public class CustomClass_Sphere {
    double r;

    //Constructor
    public CustomClass_Sphere(double radius){
        r = radius;
    }

    public double computeArea (){
        double area = 4 * Math.PI * Math.pow( r , 2 );
        double areaRounded = Math.round(area);
    return areaRounded;
    }

    public double computeVolume (){
        double volume = (4 * Math.PI * Math.pow( r , 3 ))/3;
        double volumeRounded = Math.round(volume);
        return volumeRounded;
    }
}
