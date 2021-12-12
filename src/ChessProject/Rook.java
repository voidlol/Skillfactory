package ChessProject;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (line == toLine || column == toColumn) && this.isFreeWay(chessBoard, line, column, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

}
