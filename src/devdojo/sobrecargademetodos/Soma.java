package devdojo.sobrecargademetodos;

public class Soma {

    private int num1;
    private int num2;
    private int num3;

    public void soma(int num1, int num2) {

        System.out.println(this.num1 + this.num2  );
    }

    public void soma(int num1, int num2, int num3){
        System.out.println(this.num1 + this.num2 + this.num3);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }


    

}
