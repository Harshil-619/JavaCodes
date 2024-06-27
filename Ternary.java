public class Ternary {
        public static void main(String[] args) {
                // int a = 10;
                // int b = 20;
                // String res = (a < b) ? "a is less" : "b is less";
                // System.out.println(res);

                double marks = 63.56;
                String res = (marks >= 0 && marks <= 100) ? (marks >= 0 && marks < 33 ? "Failed Student"
                                : marks > 33 && marks < 60 ? "Passed Students"
                                                : marks > 60 && marks <= 80
                                                                ? "First Class Passed Students"
                                                                : marks > 80 && marks <= 95
                                                                                ? "Distinction Acheiver"
                                                                                : "Jilla Topper")
                                : "Invalid Input";

                System.out.println(res);
        }
}
