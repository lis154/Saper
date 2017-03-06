/**
 * Created by i.lapshinov on 04.03.2017.
 */
public class Empty extends Cell {

    public Empty(int left, int top) {
        super(left, top);

        // загружаем тяжелое изображение пустой ячейки.
    }

    @Override
    public int getPoints() {
        return 10;  // 10 очков за открытую пустую ячейку
    }
}