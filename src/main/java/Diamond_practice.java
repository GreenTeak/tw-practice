
public class Diamond_practice {
    private void print_empty_string(int n){
        while (n>0) {
            System.out.print(' ');
            n--;
        }
    }

    public void print_isosceles_triangle(int i) {
        Triangle_practice triangle_practice =new Triangle_practice();
        int num =1;
        while (num<=i){
            num = getNum(i, triangle_practice, num);
        }
    }
    public void print_isosceles_triangle_reserve(int i){
        Triangle_practice triangle_practice =new Triangle_practice();
        int num =i;
        while (num>0){
            int empty_string=i-num+1;
            print_empty_string(empty_string);
            triangle_practice.print_horizontal_star(num*2-1);
            print_empty_string(empty_string);
            System.out.println();
            num--;
        }
    }

    public void print_diamond(int i) {
        print_isosceles_triangle(i);
        print_isosceles_triangle_reserve(i-1);
    }

    public void print_diamond_middle_Bill(int i) {
        Triangle_practice triangle_practice =new Triangle_practice();
        int num =1;
        while (num<i){
            num = getNum(i, triangle_practice, num);
        }
        System.out.println("Bill");
        print_isosceles_triangle_reserve(i-1);
    }

    private int getNum(int i, Triangle_practice triangle_practice, int num) {
        int empty_string = i - num;
        print_empty_string(empty_string);
        triangle_practice.print_horizontal_star(2 * num - 1);
        print_empty_string(empty_string);
        System.out.println();
        num++;
        return num;
    }
}
