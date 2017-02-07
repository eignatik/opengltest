package space.eignatik;

public class Main {
    public static void main(String[] args) {
        Checking.checkThatLibraryWorks();
        new Display().createFrame("Test", new CustomCanvas());
    }
}
