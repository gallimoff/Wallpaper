import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Room length in meters: ");
        double roomLength = in.nextDouble();
        System.out.print("Room Width in meters : ");
        double roomWidth = in.nextDouble();
        System.out.print("Room height in meters: ");
        double roomHeight = in.nextDouble();
        System.out.print("Wallpaper width in meters : ");
        double wallpaperWidth = in.nextDouble();
        System.out.print("Wallpaper length in meters: ");
        double wallpaperLength = in.nextDouble();
        double wallpaperStoke = 0.1; //
        double wallpaperSheet = Math.floor(wallpaperLength /(roomHeight + wallpaperStoke));
        double perimeter = (roomLength * 2) + (roomWidth * 2);
        double leaf = Math.ceil(perimeter / wallpaperWidth);
        int rollOfWallpaper =(int)(leaf / wallpaperSheet);
        System.out.println ("Will need " + rollOfWallpaper + " wallpaper rolls.");
        in.close();
    }
}
