public class logic {
    public static void main(String[] args) {
        int i = 10;

        if (i > 15)
        {
            System.out.println("i is larger than 15");            
        }
        else
        {
            System.out.println("i is smaller than 15");
        }

        switch (i) {
            case 15:
                System.out.println("no is 15");
                break;

            case 10:
                System.out.println("no is 10");
                break;
        
            default:
                break;
        }
    }
}
