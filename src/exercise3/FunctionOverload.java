package exercise3;

public class FunctionOverload {



        public void Area(int raidus)
        // function of circle raidus
        {
            System.out.print("\nArea of Circle    : " + (3.14 * raidus * raidus));
        }

        public void Area(int length,int breadth)
        // function of rectangle raidus
        {
            System.out.print("\nArea of Rectangle : " + (length*breadth));
        }

        public void Area(double length,int breadth)
        // function of rectangle having double length
        {
            System.out.print("\nArea of Rectangle : " + (length*breadth));
        }

        public void Area(int length,double breadth)
        // function of rectangle having double breadth
        {
            System.out.print("\nArea of Rectangle : " + (length*breadth));
        }



        public static void main(String args[])
        {

            FunctionOverload Fun = new FunctionOverload();

            Fun.Area(12);                        // call 1
            Fun.Area(19,7);             // call 2
            Fun.Area(18,9.6);          // call 3
            Fun.Area(8.3,5);          // call 4

        }
    }

