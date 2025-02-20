public class MakeArray {


    int[] nums= new int [10];
    public static void main(String[] args) {

        System.out.println("Hello world!");
MakeArray make = new MakeArray();

    }

    public MakeArray (){
        System.out.println("welcome to array world");
nums[1]=5;
nums[0]=10;
nums[2]= nums[1]*2;
nums[3]= nums[1]/5;
nums[4]= nums[5]*2;
nums[5]= 3;
nums[6]=10;
nums[7]= nums[6]-4;
nums[8]= nums[6]+5;
nums[9]= nums[0]+8;
printarray();
    }
    public void printarray (){
        System.out.println(nums[0]+nums[1]+nums[2]+nums[3]+nums[4]+nums[5]+nums[6]+nums[7]+nums[8]+nums[9]);


    }


}