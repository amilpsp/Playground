import java.util.Scanner;

public class Playground_SphereAreaVolume {

    public static void main(String[]args){

        //KlotArea = 4 · pi · r²
        //KlotVolym = (4 · pi · r³)/3

        Scanner rVarde = new Scanner(System.in);
        System.out.println("Bestäm värden av klotets radius: ");
        double r = rVarde.nextDouble();

        CustomClass_Sphere globe = new CustomClass_Sphere(r);
        int areaRounded = (int)globe.computeArea();
        int volumeRounded = (int)globe.computeVolume();

        System.out.println("klotets area är: " + areaRounded );
        System.out.println("Klotets volym är: " + volumeRounded );
    }
}
