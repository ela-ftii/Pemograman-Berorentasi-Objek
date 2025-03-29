public class ClockDemo {
    public static void main(String[] args) {
        ClockDisplay cd = new ClockDisplay();
        System.out.println("00:00");
        
        cd.setTime(11, 56);
        System.out.println("After setTime = " + cd.display());

        // Simulasi tick
        for (int i = 0; i < 5; i++) {
            cd.timeTick();
            System.out.println("After timeTick = " + cd.display());
        }

        cd.setTime(23, 59);
        cd.timeTick();
        System.out.println("After timeTick = " + cd.display());
    }
}