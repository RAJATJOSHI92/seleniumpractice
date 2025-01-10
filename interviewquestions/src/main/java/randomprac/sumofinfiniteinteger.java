package randomprac;
class Add
{
    public void add(int... num) // dynamic argument lenghth during run time
    {
        int sum=0;
        for(int i=0;i<num.length;i++)
        {

            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}
class sumofinfiniteinteger
{
    public static void main(String[] args)
    {
      Add obj= new Add();
      obj.add(10,20,30);
      obj.add(10,20);
    }
}
