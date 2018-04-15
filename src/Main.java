public class Main {



    public static void main(String[] args) {

        Water water = new Water();

        water.setBrand("农夫山泉");
        System.out.println(water.getBrand());

        water.setContainer("塑料");
        System.out.println(water.getContainer());

        Milk milk = new Milk();

        milk.setCustomer("老年人");
        System.out.println(milk.getCustomer());

        milk.setFat(980);
        System.out.println(milk.getFat());






    }
}
