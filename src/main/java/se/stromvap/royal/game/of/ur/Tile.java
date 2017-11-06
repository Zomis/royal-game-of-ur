package se.stromvap.royal.game.of.ur;

public class Tile {
    private TileType tileType;
    private GamePiece gamePiece;

    public Tile() {
        this(TileType.NORMAL);
    }

    public Tile(TileType tileType) {
        this.tileType = tileType;
    }

    public TileType getTileType() {
        return tileType;
    }

    public void setTileType(TileType tileType) {
        this.tileType = tileType;
    }

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public void setGamePiece(GamePiece gamePiece) {
        this.gamePiece = gamePiece;
    }
}