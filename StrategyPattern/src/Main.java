//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sorter  sorter = new Sorter(new BubbleSort());

        sorter.sort();

        sorter.setStrategy(new QuickSort());// switch to QuickSort
        sorter.sort();


    }
}