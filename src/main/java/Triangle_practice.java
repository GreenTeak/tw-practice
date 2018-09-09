class Triangle_practice {

    public void print_star(){
        System.out.print("*");
    }

    public void print_horizontal_star(int i) {
        while(i!=0){
            print_star();
            i--;
        }
    }

    public void print_vertical_star(int i) {
        while(i!=0){
            print_star();
            System.out.println();
            i--;
        }
    }

    public void print_right_triangle(int i) {
        int num =1;
        while(num<=i){
            print_horizontal_star(num);
            System.out.println();
            num++;
        }
    }

}
