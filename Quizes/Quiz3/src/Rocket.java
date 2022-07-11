enum RocketState {
    GROUNDED, FUELLING, LAUNCHING, ORBIT, STARBOUND
}

public class Rocket {

    public void printRocketState(RocketState state) {
        switch (state) {
            case GROUNDED:
                System.out.println("Stored inside the hangar");
                break;
            case FUELLING:
                System.out.println("On the launch pad, fuelling.");
                break;
            case LAUNCHING:
                System.out.println("Launching into the sky");
                break;
            case ORBIT:
                System.out.println("Floating around the planet");
                break;
            case STARBOUND:
                System.out.println("Deep space here we come");
                break;
            default:
                System.out.println("Unknown state");
                break;
        }
    }

    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        RocketState state = RocketState.FUELLING;
        rocket.printRocketState(state);
    }
}