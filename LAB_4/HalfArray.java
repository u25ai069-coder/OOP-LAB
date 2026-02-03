package LAB_4;

interface Function{
    public float evaluate(float n);
}

class Half implements Function{
    public float evaluate(float n)
    {
        return (float)(n/2); 
    }
}

public class HalfArray {
    public static void main(String[] args) {
        float arr[] = {1, 3, 5, 88, 6, 34, 90, 23, 3, 11, 5, 9, 89, 78, 67};

        System.out.println("Array before evaluate: ");
        for (int i=0; i<15; i++)
        {
            System.out.print(arr[i] + " ");
        }

        Half hf = new Half();
        for (int i=0; i<15; i++)
        {
            arr[i] = hf.evaluate(arr[i]);
        }

        System.out.println("\nArray after evaluate: ");
        for (int i=0; i<15; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
