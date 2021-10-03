public class Miles {
    public static void main(String[] args) {
        int amount = 1600;
        int miles;
        if (amount > 20) {
            miles = amount / 20;
        } else {
            miles = 0;
        }
        System.out.println(miles);

    }
}