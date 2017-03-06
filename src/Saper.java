/**
 * Created by i.lapshinov on 04.03.2017.
 */
/**
 * Использование
 */
public class Saper {
    public static void main(String[] args) {
        Cell cells[][] = new Cell[10][10];

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {

                if (i+j % 2 == 0) {
                    cells[i][j] = new MineProxy(i, j);
                } else {
                    cells[i][j] = new EmptyProxy(i, j);
                }
            }
        }

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                cells[i][j].open();
            }
        }
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.println(cells[i][j].toString());
            }
            }
    }
}
