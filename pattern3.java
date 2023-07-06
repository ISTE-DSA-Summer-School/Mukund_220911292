class pattern3
{
    public static void main(String ar[])
    {
        int x,y,z;
 
        for(x=0;x<11;x++)
        {
 
            for(y=11;y>x;y--)
            System.out.print(" ");
            for(z=0;z<=x;z++)
            System.out.print("* ");
 
        System.out.println();
        }
    }
}