package FundamentalsTesting.advanced.Coposition;

public class Main {
    Room room = new Room(
            new Bed(2.5, 4),
            new Tv("4k")
    );

    Bed bed = new Bed(5.5, 8.8);
    Tv tv = new Tv("2k");
}
