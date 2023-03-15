public class Main {
    public static void main(String[] args) {

        Galaxy<Integer,String> milkyWay=new Galaxy<>();//create Galaxy object
        milkyWay.create(3,"Earth");//add object
        milkyWay.reveal(3);//print object value
        milkyWay.create(4,"Mars");//add object
        milkyWay.create(5,"Jupiter");//add object
        milkyWay.destroy(4);//remove object
        milkyWay.extingush();//remove all objects
    }
}