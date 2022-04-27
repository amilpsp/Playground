import java.util.Scanner;

public class Playground_SphereAreaVolume {

    static double requestRadiusValue(){
        Scanner rVarde = new Scanner(System.in);
        System.out.println("Bestäm värden av klotets radius: ");
        double radius = rVarde.nextDouble();
        return radius;
    }

    public static void main(String[]args){
        //KlotArea = 4 · pi · r²
        //KlotVolym = (4 · pi · r³)/3

        double radius = requestRadiusValue();

        CustomClass_Sphere globe = new CustomClass_Sphere(radius);

        int areaRounded = (int)globe.computeAreaRounded();
        int volumeRounded = (int)globe.computeVolumeRounded();

        System.out.println("klotets avrundat area är: " + areaRounded );
        System.out.println("Klotets avrundat volym är: " + volumeRounded );
    }
}
