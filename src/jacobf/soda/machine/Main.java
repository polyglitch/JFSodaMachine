package jacobf.soda.machine;

public class Main
{
    public static void main(String[] args)
    {
        Context context = new Context(null);


        context.addSoda("Coke", 0);
        context.addSoda("Diet Coke", 0);

//        context.addSoda("Coke Zero", 10);
//        context.addSoda("Dr. Pepper", 10);
//        context.addSoda("Diet Dr. Pepper", 10);
//        context.addSoda("Sprite", 10);
//        context.addSoda("Sprite Zero", 10);
//        context.addSoda("Mountain Dew", 10);
//        context.addSoda("Diet Mountain Dew", 10);

        while (true) {
            context.update();
        }

        /*
        HasQuarter hasQuarter = new HasQuarter();
        hasQuarter.doAction(context);

        System.out.println(context.getState().toString());


        NoQuarter noQuarter = new NoQuarter();
        noQuarter.doAction(context);


        System.out.println(context.getState().toString());

         */
    }
}