/**
 *   класс реализует калькулятор
 */
public class Calculator {
    // результат вычисления
    private int result;

    // суммируем аргументы
    // @param params Аргументы суммирования

    public void add(int ... params){
        for (Integer param : params){
            this.result += param;
        }
    }
    /**
     *   получить результат
     *   @return результат вычисления
     */
    public int getResult() {
        return this.result;
    }

    // Очистирь результат вычисления
    public void clearResult(){
        this.result = 0;
    }
}