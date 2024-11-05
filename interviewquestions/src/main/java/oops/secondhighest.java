package oops;

public class secondhighest
{
    public static void main(String[] args)
    {
        int a[]={10,3,5,4,9,2};
        int result = secondhighest.second_largest(a);
       System.out.println(result);

        //secondhighest.second_largest(a);


    }
    public static int second_largest(int a[])
    {
        int largest=0;
        int smallest=0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i] > largest) {
                smallest = largest;
                largest = a[i];

            } else if (a[i] > smallest) {
                smallest = a[i];
            }
        }

        return smallest;
       // System.out.println(smallest);


        }

}
