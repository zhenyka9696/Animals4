public class Main {
    public static void main(String[] args) {
        System.out.println(calcCircleArea(1.0));
        System.out.println(sum(1,2));
    }

     static void hello(){
        System.out.println("hello");
    }
    static void printName(String name){

        System.out.println(name);
    }

static double calcCircleArea(double r){
        double area = Math.PI*r*r;
        return Math.PI*r*r;
}

    static double calcCircleArea(int r){
        double area = Math.PI*r*r;
        return (int)Math.PI*r*r;
    }
static int sum(int a,int b)
{
    return a+b;
}
}
