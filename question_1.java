// Написать программу вычисления n-ого треугольного числа.


// 1.0 Ввод n треугольника
// 1.1 Расчет n-треугольного числа
// 1.2 Вывод треугольниого числа




public class question_1 {
    public static void main(String[] args) {
        
        int n = inputresult(6);
        int result = calc(n);
        print(n,result);



    }
    // 2.0 Ввод n треугольника
    public static int inputresult(int n) {
        return  n;
    }
    // 2.1 Расчет n-треугольного числа 
    public static int calc(int n){
        int result;
        
        result = n*(n+1)/2;
        return result;
    }
  
    
}