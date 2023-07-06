class pattern2
{
    public static void main(String ar[])
    {
        int x,y,z;
 
        for(x=0;x<9;x++)
        {
        	for(z=0;z<x;z++)
            System.out.print("  ");
            for(y=9;y>x;y--)
            System.out.print("* ");
 
        System.out.println();
        }
    }
}