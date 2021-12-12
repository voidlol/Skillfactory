package ChessProject;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (outOfBoard(toLine, toColumn) || samePos(line, column, toLine, toColumn)) return false;
        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)) return false;
        if (Math.abs(toColumn - column) == 1 && Math.abs(toLine - line) == 2) return true;
        return Math.abs(toColumn - column) == 2 && Math.abs(toLine - line) == 1;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
