// class Calc {
//     public int add (int x ,int y) {
//         int result = x + y;
//         return result;
//     }
// }
// public class AnonymusArray {
//     public static void main(String[] args) {
//         Calc obj = new Calc();
//         int result = obj.add(5,2);
//         System.out.println(result);
//     }
// }



// class Calc {
//     public int add (int nums[]) {
//         int result = 0;
//         for (int n : nums) {
//         result = result + n;
//         }
//         return result;
//     }
// }
// public class AnonymusArray {
//     public static void main(String[] args) {
//         Calc obj = new Calc();
//         int nums[] = {3,5,7,9};
//         int result = obj.add(nums);
//         System.out.println(result);
//     }
// }



class Calc {
    public int add (int nums[]) {
        int result = 0;
        for (int n : nums) {
        result = result + n;
        }
        return result;
    }
}
public class AnonymusArray {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int nums[] = {3,5,7,9};
        int result = obj.add(new int []{3,5,7,9});
        System.out.println(result);
    }
}