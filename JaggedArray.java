// public class JaggedArray {
//     public static void main(String[] args) {
//         int nums [] [] = new int [3] [];
//          nums [0] = new int [4];
//          nums [1]= new int [2];
//          nums [2] = new int [3];

//         nums [0][0] = 2;
//         nums [0][1] = 4;
//         nums [0][2] = 6;
//         nums [0][3] = 8;
//         nums [1][0] = 10;
//         nums [1][1] = 12;
//         nums [2][0] = 14;
//         nums [2][1] = 16;
//         nums [2][2] = 18;

//         for(int i=0; i<=3;i++) {
//             for(int j=0; j<nums[i].length ; j++) {
//                 System.out.print(nums [i][j] + " ");
//             }
//             System.out.println();
//         }


//     }
// }

public class JaggedArray {
    public static void main(String[] args) {
        int nums [][] = {
                            {2,4,6,8},
                            {10,12},
                            {14,16,18}
                        };

        for(int i=0; i<=3;i++) {
            for(int j=0; j<nums[i].length ; j++) {
                System.out.print(nums [i][j] + " ");
            }
            System.out.println();
        }


    }
}
