import java.util.stream.Stream;

public class SpaceStreams {

    private static boolean startsWithM(String planet) {
        return planet.startsWith("M");
    }

    public void printPlanetsM(String[] planets) {
        Stream.of(planets)
                .filter(SpaceStreams::startsWithM)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        String[] planets = {"Zerbia", "Mun", "Monerth", "Erf", "Nitrosie", "Mercury"};
        SpaceStreams o = new SpaceStreams();
        o.printPlanetsM(planets);
    }
}