public class Calculate {

    /* Мой алгоритм отличается от предложенного в домашнем задании.
    Нет необходимости проверять все диагонали, ряды и колонки каждый ход.
    Достаточно проверить лишь ту колонку (ряд, диагональ) на которой лежит
    новая координата, ведь состояние других координат не изменилось.
    Аналогично и для диагоналей.
    */

    public boolean isWin (char[][] field, int lastRow, int lastCol) {

        char player = field[lastRow][lastCol];

        int size = field.length;
        int uBound = size - 1;
        boolean win = false;

        if (lastRow == lastCol) {
            for (int d = 0; d < size; d++) {
                if (field[d][d] != player) break;
                win = (d == uBound);
            }
            if (win) return true;
        }

        if (lastRow == uBound - lastCol) {
            for (int d = 0; d < size; d++) {
                if (field[d][uBound - d] != player) break;
                win = (d == uBound);
            }
            if (win) return true;
        }

        for (int l = 0; l < size; l++) {
            if (field[l][lastCol] != player) break;
            win = (l == uBound);
        }
        if (win) return true;

        for (int l = 0; l < size; l++) {
            if (field[lastRow][l] != player) break;
            win = (l == uBound);
        }
        return win;
    }

    public char [][] newField (int size, char emptySymbol) {
        char [][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = emptySymbol;
            }
        }
        return field;
    }
}
