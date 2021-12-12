package ChessProject;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (outOfBoard(toLine, toColumn) || samePos(line, column, toLine, toColumn)) return false;
        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(this.color)) return false;
        return !isUnderAttack(chessBoard, toLine, toColumn) && Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ChessPiece figure = board.board[i][j];
                if (figure != null && !figure.getSymbol().equals("K") && !figure.getColor().equals(this.getColor()) && figure.canMoveToPosition(board, i, j, line, column)) return true;
            }
        }
        return false;
    }
}
