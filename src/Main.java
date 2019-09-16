import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Room length in meters: "); // Длина комнаты.
        double roomLength = in.nextDouble();
        System.out.print("Room Width in meters : "); // Ширина комнаты.
        double roomWidth = in.nextDouble();
        System.out.print("Room height in meters: "); // Высота комнаты.
        double roomHeight = in.nextDouble();
        System.out.print("Wallpaper width in meters : "); // Ширина обоев.
        double wallpaperWidth = in.nextDouble();
        System.out.print("Wallpaper length in meters: "); // Длина обоев.
        double wallpaperLength = in.nextDouble();
        double wallpaperStoke = 0.1; // Запас обоев.
        double wallpaperSheet = Math.floor(wallpaperLength /(roomHeight + wallpaperStoke)); // Количество полотниц с одного рулона.
        double perimeter = (roomLength * 2) + (roomWidth * 2); //Периметр комнаты.
        double leaf = Math.ceil(perimeter / wallpaperWidth); //Необходимов количество полотниц.
        double rollOfWallpaper = (leaf / wallpaperSheet);
        System.out.println ("You will need " + Math.ceil(rollOfWallpaper) + " wallpaper rolls."); //Необходимое количество рулонов.
        in.close();
    }
}
