package writer;

/**
 * Created by Olga on 21.03.2017.
 */
public class Writer {

    public void writeWeightForPresent(){
        System.out.println("Введите требуемый вес подарка:");
    }

    public void writeItemsCount(){
        System.out.println("Введите требуемое количество айтемов в подарке, но не менее 7000:");
    }

    public void chooseSourseForItemCount(){
        System.out.println("Введите 1, если хотите напечатать количество айтемов в консоли, или 2, если хотите считать количество айтемов из файла:");

    }

}
