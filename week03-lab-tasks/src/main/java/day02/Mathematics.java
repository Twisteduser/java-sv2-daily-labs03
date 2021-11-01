package day02;

public class Mathematics {

    public boolean isPrime (int number){
        if (number <2){
            return false;
        }
        boolean result = true;
        for (int i = 2; i<= Math.sqrt(number); i++){
            if (number%i ==0){
                result = false;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.isPrime(11));
    }

}