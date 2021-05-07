public class Main {
    public static void main(String[] args){
        Simulation s1 = null;
        try {
            s1 = new Simulation();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert s1 != null;
        s1.run();

    }
}
