import java.util.Random;

public class ObjectFactory {
    private static ObjectFactory instance=null;
    private ObjectImages images=new ObjectImages();


    private ObjectFactory(){

    }
    public static synchronized ObjectFactory getInstance(){
        if(instance==null){
            instance=new ObjectFactory();
        }
        return instance;

    }

    public Fruit createFruit(){
        Random random=new Random();
        int x=random.nextInt(5);

        switch (x){
            case 0:
                return new Fruit(images.getBanana());
            case 1:
                return new Fruit(images.getApple());
            case 2:
                return new Fruit(images.getMango());
            case 3:
                return new Fruit(images.getWatermelon());
            case 4:
                return new Fruit(images.getOrange());
            default:
                return null;
        }
    }

    public Fruit createSpecialFruit(String fruitType){
        switch (fruitType){
            case "F":
                return new FreezeFruit(images.getFreezeFruit());
            case "M":
                return new MultiplierFruit(images.getMultiplierFruit());
            default:
                return null;
        }

    }

    public Bombs createBomb(String bombType){
        switch (bombType){
            case "F":
//                return new FatalBomb(images.getFatalBomb());
            case "D":
//                return new DangerousBomb(images.getDangerousBomb());
            default:
                return null;
        }
    }


}