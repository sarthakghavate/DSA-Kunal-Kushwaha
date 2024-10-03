package BinarySearchQuestions;

public class MinimumSpeedToArriveOnTime {
    public static void main(String[] args) {
        System.out.println((double) 100000/10000000);
        double a = 2.01;
        double b = 2.00;
        float c = (float) (a-b);
        System.out.println(c);
//        System.out.println(.2f);
        System.out.println("a-b = " + (a-b));
        int [] dist = {1,1,100000};
        System.out.println(canReach(dist,2.01,10000000));
    }
    private static boolean canReach(int [] dist, double hr, int speed){
        double hour = hr;
        System.out.println("for speed : "+speed);

        int trainCounter = 0;
        for(int i = 0 ; i < dist.length-1; i++){
            double time = (double)dist[i]/speed;
            System.out.println("time : "+time);
            hr = Math.floor(hr - time);
             System.out.println("hour : "+hr);
            trainCounter++;
            if(hr <= 0 ){
                System.out.println("less than equal to 0");
                return false;
            }
        }

        System.out.println(trainCounter);

//        float hrRem = (float) (hour - trainCounter);
//        System.out.println(hour);
//         for last train
//        System.out.println((double)dist[dist.length - 1] / speed);
        if(((double)dist[dist.length - 1] / speed) <= hour){
            System.out.println("yay");
            trainCounter++;
        }
        System.out.println(trainCounter);
        return trainCounter == dist.length;
    }
}
