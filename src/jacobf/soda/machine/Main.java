package jacobf.soda.machine;

public class Main
{
    public static void main(String[] args)
    {
        Context context = new Context(null);
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();

        SodaList sl = new SodaList();

        sl.addSoda("Coke", 10);
        sl.addSoda("Diet Coke", 10);
        sl.addSoda("Coke Zero", 10);
        sl.addSoda("Dr. Pepper", 10);
        sl.addSoda("Diet Dr. Pepper", 10);
        sl.addSoda("Sprite", 10);
        sl.addSoda("Sprite Zero", 10);
        sl.addSoda("Mountain Dew", 10);
        sl.addSoda("Diet Mountain Dew", 10);



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