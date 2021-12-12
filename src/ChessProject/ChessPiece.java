package ChessProject;

public abstract class ChessPiece {
    String color;
    boolean check;

    public ChessPiece(String color) {
        this.color = color;
        this.check = true;
    }

    public String getColor() {
        return this.color;
    }
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();

    public boolean outOfBoard(int toLine, int toColumn) {
        return (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0);
    }

    public boolean samePos(int line, int column, int toLine, int toColumn) {
        return (line == toLine && column == toColumn);
    }

    protected boolean isFreeWay(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (outOfBoard(toLine, toColumn) || samePos(line, column, toLine, toColumn)) return false;
        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)) return false;
        int lineInc = Integer.compare(toLine, line);
        int columnInc = Integer.compare(toColumn, column);
        int num = Math.max(Math.abs(toLine - line), Math.abs(toColumn - column));
        for (int i = 1; i <= num - 1; i++) {
            if (chessBoard.board[line+lineInc*i][column+columnInc*i] != null) return false;
        }
        return true;
    }

}
