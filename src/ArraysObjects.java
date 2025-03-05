public class ArraysObjects {
    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }

    Sushi[] soosh = new Sushi[10];

    public ArraysObjects() {
        System.out.println("making arrays with objects");
        Sushi a = new Sushi(10.99);
        Sushi b = new Sushi(8.99);
        for (int x = 0; x < soosh.length; x++) {

        }
        for (int x = 2; x < 10; x++) {
            soosh[x] = new Sushi(Math.random() * 250);


        }

        soosh[0] = a;
        soosh[0].print();
        soosh[1] = b;
        printArray();
    }

    public void printArray() {
        for (int x = 0; x < soosh.length; x++) {
            soosh[x].print();

        }
    }
//use for loop
public void changeSize() {
    for (int x=0; x< soosh.length; x++){
        soosh[x].size = (int)(Math.random()*10+10);
    }

        }




    }


















