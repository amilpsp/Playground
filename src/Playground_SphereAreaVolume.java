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

        int areaRounded = (int)globe.computeArea();
        int volumeRounded = (int)globe.computeVolume();

        System.out.println("klotets area är: " + areaRounded );
        System.out.println("Klotets volym är: " + volumeRounded );
    }
}
