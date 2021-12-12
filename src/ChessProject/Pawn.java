package ChessProject;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isFreeWay(chessBoard, line, column, toLine, toColumn)) return false;
        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)) return false;
        if (this.color.equals("White")) {
            if (line == 1) {
                return (toLine - line) <= 2 && (toLine != line);
            } else {
                return toLine - line == 1;
            }
        } else {
            if (line == 6) {
                return (line - toLine) <= 2 && (toLine != line);
            } else {
                return line - toLine == 1;
            }
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
