public class Inherit {
    public static void main(String[] args) {
        //CalcInherit calc = new CalcInherit();
        AdvcalaInherit calc = new AdvcalaInherit();
       int a = calc.add(5, 3);
       int b = calc.sub(5, 3);
       int c = calc.mul(34, 5);
       int d = calc.div(34, 5);

        System.out.println(a + " " + b + " " + c + " " + d );

    }
    
}
