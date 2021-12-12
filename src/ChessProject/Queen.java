package ChessProject;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return this.isFreeWay(chessBoard, line, column, toLine, toColumn) && ((line == toLine || column == toColumn) || Math.abs(toLine - line) == Math.abs(toColumn - column));
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
