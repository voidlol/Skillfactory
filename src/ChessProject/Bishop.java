package ChessProject;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return Math.abs(toLine - line) == Math.abs(toColumn - column) && this.isFreeWay(chessBoard, line, column, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
