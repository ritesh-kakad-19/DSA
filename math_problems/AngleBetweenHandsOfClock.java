package math_problems;

public class AngleBetweenHandsOfClock {
    public static void main(String[] args) {

        int hour = 3;
        int minutes = 15;
        
        double hourDegree = (hour * 5) * 6;
        System.out.print(hourDegree +" ");
        hourDegree = hourDegree + (minutes * 0.5);
        System.out.print(hourDegree +" ");

        if(hourDegree >= 360){
            hourDegree -= 360;
        }

        double minuteDegree = (minutes * 6);
        System.out.print(minuteDegree +" ");

        double angle = Math.abs(minuteDegree - hourDegree);

        System.out.println(Math.min(360-angle, angle));;
    }
}
